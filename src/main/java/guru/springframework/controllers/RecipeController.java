package guru.springframework.controllers;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("recipe/new")
    public String newRecipe(Model model){
        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }
    @PostMapping
    @RequestMapping("recipe")
    public String saveOrUpdate(@ModelAttribute RecipeCommand command){
        RecipeCommand savedCommand = recipeService.saveRecipeCommand(command);

        return "redirect:/recipe/show";
    }

}
