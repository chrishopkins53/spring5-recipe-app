package com.chrishop.spring5recipeapp.repositories;

import com.chrishop.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
