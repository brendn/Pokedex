package co.grandcircus.pokedex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FavoriteController {
	
	@RequestMapping("/favorite")
	public String favoritePage(@RequestParam String id, Model model) {
		
		return "favorite";
	}
}
