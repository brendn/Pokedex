package co.grandcircus.pokedex.controllers;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.grandcircus.pokedex.FavoritePokemon;

public interface PokemonRepository extends MongoRepository<FavoritePokemon, String>{

}
