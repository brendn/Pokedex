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
   
    	try {
			if (!(search.equals("")) && !(service.getPokemonByName(search) == null)) {
				search = search.toLowerCase();
		    	Pokemon searchPokemon = service.getPokemonInfo(service.getPokemonByName(search).getID());
		        model.addAttribute("types", searchPokemon.getType());
				model.addAttribute("search", service.getPokemonByName(search));
				model.addAttribute("searchPokemon", service.getPokemonInfo(service.getPokemonByName(search).getID()));
				return "searchresults";
			} else {
				setupHome(model);
				model.addAttribute("error", "<b>ERROR</b>: Pokemon not found! Please try again.");
				return "home";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			setupHome(model);
			model.addAttribute("error", "<b>ERROR</b>: Pokemon not found! Please try again.");
			return "home";
		}
    }

	private void setupHome(Model model) {
		Pokemon pokemon = service.getRandomPokemon();
		model.addAttribute("pokemon", pokemon);
		model.addAttribute("types", pokemon.getType());
	}

}
