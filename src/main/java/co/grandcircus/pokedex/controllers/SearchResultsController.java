package co.grandcircus.pokedex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.pokedex.api.PokemonService;

@Controller
public class SearchResultsController {
	
	@Autowired
	public PokemonService service;
	private PokemonRepository repo;
	
	@RequestMapping("/searchresults")
	public String searchResults(Model model) {
		model.addAttribute("pokemon", service.getPokemon(1154));
		model.addAttribute("allPokemon", service.getPokemonInfo(100));
		return "searchresults";
	}
//	@PostMapping("/searchResults")
//	public String addPokemonFavorites(@RequestParam String name, @RequestParam Integer id,
//			@RequestParam String[] type, @RequestParam String[] sprites, Model model) {
//		repo.save();
//		model.addAttribute("name", name);
//		model.addAttribute("id", id);
//		model.addAttribute("type", type);
//		model.addAttribute("sprites", sprites);
//		
//		return "favorites";
//	}
}
