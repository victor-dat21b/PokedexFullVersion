package com.example.pokedexfullversion.controller;

import com.example.pokedexfullversion.model.Pokemon;
import com.example.pokedexfullversion.services.PokedexLogic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PokemonController {


    @GetMapping("/")
    public String mainPage(){
        return "index";
    }



    @GetMapping("/showall")
    public String indexPage(Model model){
        PokedexLogic myLogic = new PokedexLogic();
        List<Pokemon> data = myLogic.showAllPokemon();
        model.addAttribute("pokemons", data);
        return "showAllPokemon";
    }







    @GetMapping("/addpokemon")
    public String addPokemon(){
        PokedexLogic myLogic = new PokedexLogic();
        myLogic.createPokemon(new Pokemon(16, "Pidgey", 56, 35, 35, 40, 45, 40, "Normal", "Flying"));



        return "addpokemon";
    }





}
