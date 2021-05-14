package com.example.springdatademo.controllers;

import com.example.springdatademo.servicies.AuthorService;
import com.example.springdatademo.servicies.BookService;
import com.example.springdatademo.servicies.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class BookshopController implements CommandLineRunner {

    private final AuthorService authorService;
    private final CategoryService categoryService;
    private final BookService bookService;

    @Autowired
    public BookshopController(AuthorService authorService, CategoryService categoryService, BookService bookService) {
        this.authorService = authorService;
        this.categoryService = categoryService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {

       this.authorService.seedAuthors();
       this.categoryService.seedCategories();
       this.bookService.seedBooks();
    }
}
