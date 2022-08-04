package co.grandcircus.pokedex.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.pokedex.FavoritePokemon;
import co.grandcircus.pokedex.api.PokemonService;
import co.grandcircus.pokedex.api.model.Pokemon;

@Controller
public class SearchResultsController {

	@Autowired
	public PokemonService service;

	@Autowired
	private PokemonRepository repo;

	@RequestMapping("/searchresults")
	public String searchResults(Model model, @ModelAttribute("Search") String search) {
		search = search.toLowerCase();
    	
    	try {
			if (!(search.equals("")) && !(service.getPokemonByName(search) == null)) {
				Pokemon searchPokemon = service.getPokemonInfo(service.getPokemonByName(search).getID());
		        model.addAttribute("types", searchPokemon.getType());
				model.addAttribute("search", service.getPokemonByName(search));
				model.addAttribute("searchPokemon", searchPokemon);
				
				return "searchresults";
			} else {
				
				return "redirect:searchresults";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:searchresults";
		}
    }

	@PostMapping("/addfavorite")
	public String addFavorite(@RequestParam String favorite, Model model) {
		FavoritePokemon pokemon = new FavoritePokemon(service.getPokemonByName(favorite).getID(),
				service.getPokemonByName(favorite).getName());

		repo.save(pokemon);
		return "redirect:/";
	}

}
