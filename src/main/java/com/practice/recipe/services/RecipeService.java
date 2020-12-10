package com.practice.recipe.services;

import com.practice.recipe.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getAllRecipe();
}
