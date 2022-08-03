package co.grandcircus.pokedex;

import co.grandcircus.pokedex.api.PokemonService;
import co.grandcircus.pokedex.api.model.Pokemon;
import co.grandcircus.pokedex.api.model.Sprite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PokedexController {

    @Autowired
    public PokemonService service;

    @RequestMapping("/")
    public String home(Model model) {
        Pokemon pokemon = service.getRandomPokemon();
        model.addAttribute("pokemon", pokemon);
        StringBuilder types = new StringBuilder("[");

        for (int i = 0; i < pokemon.getTypes().length; i++) {
            if (i == pokemon.getTypes().length - 1) {
                types.append(pokemon.getTypes()[i]);
            } else {
                types.append(pokemon.getTypes()[i]).append(", ");
            }
        }
        types.append("]");
        model.addAttribute("types", types.toString());
        return "home";
    }

    @PostMapping("/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("input", search);
        return "searchresults";
    }

}
