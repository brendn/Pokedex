package co.grandcircus.pokedex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PokedexController {

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }
}
