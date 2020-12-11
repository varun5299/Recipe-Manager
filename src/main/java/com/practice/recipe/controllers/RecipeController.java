package com.practice.recipe.controllers;

import com.practice.recipe.repositories.RecipeRepository;
import com.practice.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
    private final RecipeService recipeService;
    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeService recipeService, RecipeRepository recipeRepository) {
        this.recipeService = recipeService;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping("/recipe/show/{id}")
    public String getRecipeById(@PathVariable String id,Model model) {
        model.addAttribute("recipe",recipeService.getRecipeById(Long.valueOf(id)));
        return "recipe/show";
    }
}