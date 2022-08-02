package co.grandcircus.pokedex.api;

import co.grandcircus.pokedex.api.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PokemonService {

    private RestTemplate request = new RestTemplate();

    private static final String REQUEST_LIST = "https://pokeapi.co/api/v2/pokemon?limit=%d&offset=0";
    private static final String REQUEST_INFO = "https://pokeapi.co/api/v2/pokemon/%d";

    public List<Pokemon> getPokemon(int limit) {
        String req = String.format(REQUEST_LIST, limit);
        return request.getForObject(req, PokemonResponse.class).getResults();
    }

    public Pokemon getPokemonInfo(int id) {
        return request.getForObject(String.format(REQUEST_INFO, id), Pokemon.class);
    }
    
    public Pokemon readAll(Long id) {
		String url = "https://pokeapi.co/api/v2/pokemon/{id}";
		
		Pokemon response = request.getForObject(url, Pokemon.class, id);
		return response;
	}
    
}
