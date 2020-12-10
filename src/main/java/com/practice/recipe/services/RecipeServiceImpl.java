package com.practice.recipe.services;

import com.practice.recipe.model.Recipe;
import com.practice.recipe.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getAllRecipe() {

        log.debug("hello, i am in service");
        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
