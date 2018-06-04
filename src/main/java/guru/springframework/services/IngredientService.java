package guru.springframework.services;

/**
 * Created by Lewan on 01.06.2018.
 */
import guru.springframework.commands.IngredientCommand;


public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}