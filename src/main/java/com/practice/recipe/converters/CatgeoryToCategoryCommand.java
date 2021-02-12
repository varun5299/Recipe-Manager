package com.practice.recipe.converters;

import com.practice.recipe.command.CategoryCommand;
import com.practice.recipe.model.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CatgeoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null)
            return null;

        final CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(source.getId());
        categoryCommand.setDescription(source.getDescription());
        return categoryCommand;
    }
}
