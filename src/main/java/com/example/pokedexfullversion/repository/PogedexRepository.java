package com.example.pokedexfullversion.repository;

import com.example.pokedexfullversion.model.Pokemon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PogedexRepository {
    private final static String DB_URL = "jdbc:mysql://localhost:3306/pokedex?useSSL=false&serverTimezone=UTC";
    private final static String user = "root";
    private final static String pw = "12345";
    private Connection connection;

    ArrayList<Pokemon> myPokemons = new ArrayList<>();


    public PogedexRepository(){
        connectToMySQL();
    }





        public ArrayList<Pokemon> showAllPokemon() {
            try {
                this.myPokemons.clear();
                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM pokemon";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    int pokedex_number = resultSet.getInt("pokedex_number");
                    String name = resultSet.getString("name");
                    int speed = resultSet.getInt("speed");
                    int special_defence = resultSet.getInt("special_defence");
                    int special_attack = resultSet.getInt("special_attack");
                    int defence = resultSet.getInt("defence");
                    int attack = resultSet.getInt("attack");
                    int hp = resultSet.getInt("hp");
                    String primary_type = resultSet.getString("primary_type");
                    String secondary_type = resultSet.getString("secondary_type");
                    this.myPokemons.add(new Pokemon(pokedex_number, name, speed, special_defence, special_attack, defence, attack, hp
                    , primary_type, secondary_type));
                }


            } catch (Exception e) {
                System.out.println("Error in showAllRows");
            }
            return this.myPokemons;
        }


        void insertData() {
            try {
                String query = "INSERT INTO pokemon VALUES (null, ?, ?);";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, "Shooter");
                preparedStatement.setDouble(2, 100);
                preparedStatement.executeUpdate();
                System.out.println("Indsat ny række OK");
            } catch (Exception e) {

            }


        }

        void connectToMySQL() {
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection(DB_URL, user, pw);

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }





        /*
    public Pokemon findById(int id){
    }

         */
    public Pokemon create(Pokemon pokemon){
        return pokemon;
    }

    public void update(Pokemon pokemon){

    }
    public void deleteById(int id){

    }







    }
