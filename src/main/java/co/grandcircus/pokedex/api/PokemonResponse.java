package co.grandcircus.pokedex.api;

import co.grandcircus.pokedex.api.model.Pokemon;

import java.util.List;

public class PokemonResponse {

    private List<Pokemon> results;

    public List<Pokemon> getResults() {
        return results;
    }
}
