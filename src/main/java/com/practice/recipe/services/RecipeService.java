package com.practice.recipe.services;

import com.practice.recipe.command.RecipeCommand;
import com.practice.recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getAllRecipe();
    Recipe getRecipeById(Long id);
    RecipeCommand savedRecipeCommand(RecipeCommand recipeCommand);
    RecipeCommand findCommandbyId(Long id);
    Recipe findById(Long l);
    void deleteRecipeById(Long id);
}
