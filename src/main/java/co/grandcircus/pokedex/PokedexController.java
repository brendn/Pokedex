package co.grandcircus.pokedex;

import co.grandcircus.pokedex.api.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PokedexController {

    @Autowired
    public PokemonService service;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("pokemon", service.getPokemon(6));
        model.addAttribute("ditto", service.getPokemonInfo(132));
        return "home";
    }

}
