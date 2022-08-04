package co.grandcircus.pokedex;

import co.grandcircus.pokedex.api.PokemonService;
import co.grandcircus.pokedex.api.model.Pokemon;
import co.grandcircus.pokedex.api.model.Sprite;
import co.grandcircus.pokedex.controllers.PokemonRepository;
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
        model.addAttribute("types", pokemon.getType());
        return "home";
    }

    @PostMapping("/searchresults")
    public String search(@RequestParam String search, Model model) {
    	search = search.toLowerCase();
    	Pokemon searchPokemon = service.getPokemonInfo(service.getPokemonByName(search).getID());
    	try {
			if (!(search.equals("")) && !(service.getPokemonByName(search) == null)) {
				StringBuilder types = new StringBuilder("[");

		        for (int i = 0; i < searchPokemon.getTypes().length; i++) {
		            if (i == searchPokemon.getTypes().length - 1) {
		                types.append(searchPokemon.getTypes()[i]);
		            } else {
		                types.append(searchPokemon.getTypes()[i]).append(", ");
		            }
		        }
		        types.append("]");
		        model.addAttribute("types", types.toString());
				model.addAttribute("search", service.getPokemonByName(search));
				model.addAttribute("searchPokemon", service.getPokemonInfo(service.getPokemonByName(search).getID()));
				
				return "searchresults";
			} else {
				
				return "redirect:/";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/";
		}
    }

}
