package com.practice.recipe.controllers;

import com.practice.recipe.command.RecipeCommand;
import com.practice.recipe.repositories.RecipeRepository;
import com.practice.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {
    private final RecipeService recipeService;
    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeService recipeService, RecipeRepository recipeRepository) {
        this.recipeService = recipeService;
        this.recipeRepository = recipeRepository;
    }

    @RequestMapping("/recipe/{id}/show")
    public String getRecipeById(@PathVariable String id,Model model) {
        model.addAttribute("recipe",recipeService.getRecipeById(Long.valueOf(id)));
        return "recipe/show";
    }
    @RequestMapping("recipe/new")
    public String newRecipe(Model model){
        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }

    @PostMapping("recipe")
    public String saveOrUpdate(@ModelAttribute RecipeCommand command){
        RecipeCommand savedCommand = recipeService.savedRecipeCommand(command);

        return "redirect:/recipe/" + savedCommand.getId()+"/show";
    }
    @GetMapping("recipe/{id}/update")
    public String updateRecipe(@PathVariable String id, Model model){
        model.addAttribute("recipe",recipeService.findCommandbyId(Long.valueOf(id)));
        return "recipe/recipeform";
    }

    @GetMapping("recipe/{id}/delete")
    public String deleteRecipe(@PathVariable String id){
        recipeService.deleteRecipeById(Long.valueOf(id));
        return "redirect:/";
    }
}