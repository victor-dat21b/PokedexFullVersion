package com.example.pokedexfullversion.services;

import com.example.pokedexfullversion.model.Pokemon;
import com.example.pokedexfullversion.repository.PogedexRepository;

import java.util.ArrayList;

public class PokedexLogic {
    PogedexRepository myRepo;



    public PokedexLogic(){
    this.myRepo = new PogedexRepository();
    }

    public ArrayList<Pokemon> showAllPokemon(){
        return this.myRepo.showAllPokemon();
    }
}
