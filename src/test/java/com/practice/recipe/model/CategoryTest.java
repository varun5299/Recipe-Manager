package com.practice.recipe.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    private Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }

    @Test
    void getId() {
        Long id = 4L;
        category.setId(id);
        assertEquals(id,category.getId());
    }

    @Test
    void getDescription() {
        String description = "Test";
        category.setDescription(description);
        assertEquals(description,category.getDescription());
    }

    @Test
    void setId() {
    }

    @Test
    void setDescription() {
    }
}