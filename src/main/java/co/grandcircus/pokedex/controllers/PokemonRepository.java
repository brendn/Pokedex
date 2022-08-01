package co.grandcircus.pokedex.controllers;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.grandcircus.pokedex.Pokemon;

public interface PokemonRepository extends MongoRepository<Pokemon, String>{

}
