package com.example.pokedexfullversion;

import com.example.pokedexfullversion.model.Pokemon;
import com.example.pokedexfullversion.services.PokedexLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class PokedexFullVersionApplication {


    public static void main(String[] args) {
        SpringApplication.run(PokedexFullVersionApplication.class, args);
    }



}
