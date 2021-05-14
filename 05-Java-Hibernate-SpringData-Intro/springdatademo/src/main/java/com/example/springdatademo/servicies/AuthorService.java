package com.example.springdatademo.servicies;

import com.example.springdatademo.entities.Author;

import java.io.IOException;

public interface AuthorService {
    void seedAuthors() throws IOException;
    int getAuthorCount();
    Author findAuthorById(Long id);
}
