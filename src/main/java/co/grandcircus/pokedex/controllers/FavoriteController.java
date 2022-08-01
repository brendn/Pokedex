package co.grandcircus.pokedex.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.pokedex.Pokemon;
import co.grandcircus.pokedex.api.PokemonService;

@Controller
public class FavoriteController {
	
	@Autowired
	private PokemonRepository repo;
	
	@RequestMapping("/favorite")
	public String favoritePage(Model model) {
		List<Pokemon> pokemonList = repo.findAll();
		model.addAttribute("pokemonList", pokemonList);
		
		return "favorites";
	}
	
	@RequestMapping("/addFavorite")
	public String addFavorite(@RequestParam int id, @RequestParam String name, @RequestParam String type, @RequestParam String sprite, Model model) {
		Pokemon pokemon = new Pokemon(id, name, type, sprite);
		repo.insert(pokemon);
		List<Pokemon> pokemonList = repo.findAll();
		model.addAttribute("pokemonList", pokemonList);
		
		return "favorites";
	}
}
