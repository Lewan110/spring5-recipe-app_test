package guru.springframework.services;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Recipe findById(Long l);

    Set<Recipe> getRecipes();

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
