package com.example.springdatademo.servicies.impl;

import com.example.springdatademo.entities.Category;
import com.example.springdatademo.repositories.CategoryRepo;
import com.example.springdatademo.servicies.CategoryService;
import com.example.springdatademo.util.FileUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final static String CATEGORY_FILE_PATH = "src/main/resources/files/categories.txt";
    private final CategoryRepo categoryRepo;
    private final FileUtil fileUtil;

    public CategoryServiceImpl(CategoryRepo categoryRepo, FileUtil fileUtil) {
        this.categoryRepo = categoryRepo;
        this.fileUtil = fileUtil;
    }

    @Override
    public void seedCategories() throws IOException {
        if(this.categoryRepo.count() != 0){
            return;
        }

        String[] categories = fileUtil.fileContext(CATEGORY_FILE_PATH);
        for (String input : categories) {
            Category category = new Category();
            category.setName(input);

            this.categoryRepo.saveAndFlush(category);

        }

    }

    @Override
    public Category getCategoryById(long categoryId) {
        return this.categoryRepo.getOne(categoryId);
    }
}
