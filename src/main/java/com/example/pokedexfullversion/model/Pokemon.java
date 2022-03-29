package com.example.pokedexfullversion.model;

public class Pokemon {
    int pokedex_number;
    String name;
    int speed;
    int special_defence;
    int special_attack;
    int defence;
    int attack;
    int hp;
    String primary_type;
    String secondary_type;


    public Pokemon(int pokedex_number, String name, int speed, int special_defence, int special_attack, int defence, int attack, int hp, String primary_type, String secondary_type) {
        this.pokedex_number = pokedex_number;
        this.name = name;
        this.speed = speed;
        this.special_defence = special_defence;
        this.special_attack = special_attack;
        this.defence = defence;
        this.attack = attack;
        this.hp = hp;
        this.primary_type = primary_type;
        this.secondary_type = secondary_type;
    }

    public int getPokedex_number() {
        return pokedex_number;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpecial_defence() {
        return special_defence;
    }

    public int getSpecial_attack() {
        return special_attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    public String getPrimary_type() {
        return primary_type;
    }

    public String getSecondary_type() {
        return secondary_type;
    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "pokedex_number=" + pokedex_number +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                ", special_defence=" + special_defence +
                ", special_attack=" + special_attack +
                ", defence=" + defence +
                ", attack=" + attack +
                ", hp=" + hp +
                ", primary_type='" + primary_type + '\'' +
                ", secondary_type='" + secondary_type + '\'' +
                '}';
    }
}
