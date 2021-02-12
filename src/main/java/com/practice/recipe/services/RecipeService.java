package com.practice.recipe.services;

import com.practice.recipe.command.RecipeCommand;
import com.practice.recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);
    void deleteById(Long l);
}
