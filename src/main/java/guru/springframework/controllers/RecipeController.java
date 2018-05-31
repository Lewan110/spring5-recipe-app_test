package guru.springframework.controllers;

import guru.springframework.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lewan on 31.05.2018.
 */
@Controller
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping("/recipe/show/{id}")
    public String showbyId(@PathVariable String id, Model model){

        model.addAttribute("recipe",recipeService.findById(new Long(id)));

        return "recipe/show";
    }

}
