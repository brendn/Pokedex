package co.grandcircus.pokedex.api;

import co.grandcircus.pokedex.api.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PokemonService {

    private RestTemplate request = new RestTemplate();

    private static final String REQUEST_LIST = "https://pokeapi.co/api/v2/pokemon?limit=%d&offset=0";
    private static final String REQUEST_INFO_ID = "https://pokeapi.co/api/v2/pokemon/%d";
    private static final String REQUEST_INFO_NAME = "https://pokeapi.co/api/v2/pokemon/%s";

    public List<Pokemon> getPokemon(int limit) {
        String req = String.format(REQUEST_LIST, limit);
        return request.getForObject(req, PokemonResponse.class).getResults();
    }

    public Pokemon getPokemonInfo(int id) {
        return request.getForObject(String.format(REQUEST_INFO_ID, id), Pokemon.class);
    }

    public Pokemon getPokemonByName(String name) {
        return request.getForObject(String.format(REQUEST_INFO_NAME, name), Pokemon.class);
    }

    public Pokemon getRandomPokemon() {
        return getPokemonInfo(new Random().nextInt(151));
    } 
}
