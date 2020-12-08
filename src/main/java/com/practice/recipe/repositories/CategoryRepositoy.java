package com.practice.recipe.repositories;

import com.practice.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositoy extends CrudRepository<Category, Long> {
}
