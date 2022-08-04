package co.grandcircus.pokedex.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.pokedex.FavoritePokemon;
import co.grandcircus.pokedex.api.PokemonService;
import co.grandcircus.pokedex.api.model.Pokemon;

@Controller
public class FavoriteController {
	
	@Autowired
	private PokemonRepository repo;
	
	@Autowired
	private PokemonService apiService;
	
	@RequestMapping("/favorite")
	public String favoritePage(Model model) {
		List<FavoritePokemon> pokemonList = repo.findAll();

		List<Pokemon> infoList = new ArrayList<>();
		for (FavoritePokemon dude : pokemonList) {
			infoList.add(apiService.getPokemonInfo(dude.getId()));
		}
		model.addAttribute("infoList", infoList);

		
		return "favorites";
	}

	@RequestMapping("/delete")
	public String deleteFavorite(@RequestParam String name, Model model) {
		for (FavoritePokemon pokemon : repo.findAll()) {
			if (pokemon.getName().equalsIgnoreCase(name)) {
				repo.delete(pokemon);
			}
		}
		List<Pokemon> infoList = new ArrayList<>();
		for (FavoritePokemon dude : repo.findAll()) {
			infoList.add(apiService.getPokemonInfo(dude.getId()));
		}
		model.addAttribute("infoList", infoList);
		return "favorites";
	}
}
