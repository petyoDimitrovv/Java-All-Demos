package com.example.springdatademo.servicies;

import com.example.springdatademo.entities.Category;

import java.io.IOException;

public interface CategoryService {
    void seedCategories() throws IOException;

    Category getCategoryById(long categoryId);
}

