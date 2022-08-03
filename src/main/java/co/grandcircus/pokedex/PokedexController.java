package co.grandcircus.pokedex;

import co.grandcircus.pokedex.api.PokemonService;
import co.grandcircus.pokedex.api.model.Pokemon;
import co.grandcircus.pokedex.api.model.Sprite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PokedexController {

    private List<Pokemon> cache = new ArrayList<>();

    @Autowired
    public PokemonService service;

    @RequestMapping("/")
    public String home(Model model) {
        if (cache.size() <= 0) {
            load();
        }
        model.addAttribute("pokemon", cache);
        return "home";
    }

    /**
     * Adds the actual information for each Pokemon since the getPokemon results only provide a name.
     */
    private void load() {
        cache = service.getPokemon(8);
        List<Pokemon> fixed = new ArrayList<>();
        for (Pokemon pokemon : cache) {
            pokemon = service.getPokemonByName(pokemon.name);
            fixed.add(pokemon);
        }
        cache = fixed;
    }

}
