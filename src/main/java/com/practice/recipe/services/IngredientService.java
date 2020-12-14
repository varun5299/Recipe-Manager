package com.practice.recipe.services;

import com.practice.recipe.command.IngredientCommand;
import org.springframework.stereotype.Service;


@Service
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long RecipeId, Long IngredientId);
}
