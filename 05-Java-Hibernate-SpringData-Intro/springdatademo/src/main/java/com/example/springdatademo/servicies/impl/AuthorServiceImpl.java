package com.example.springdatademo.servicies.impl;

import com.example.springdatademo.entities.Author;
import com.example.springdatademo.repositories.AuthorRepo;
import com.example.springdatademo.servicies.AuthorService;
import com.example.springdatademo.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final static String AUTHOR_FILE_PATH = "src/main/resources/files/authors.txt";
    private final AuthorRepo authorRepo;
    private final FileUtil fileUtil;

    @Autowired
    public AuthorServiceImpl(AuthorRepo authorRepo, FileUtil fileUtil) {
        this.authorRepo = authorRepo;
        this.fileUtil = fileUtil;
    }

    @Override
    public void seedAuthors() throws IOException {
        if(this.authorRepo.count() != 0){
            return;
        }

        String[] authors = this.fileUtil.fileContext(AUTHOR_FILE_PATH);

        for (String input : authors) {
            String[] params = input.split("\\s+");
            Author author = new Author();
            author.setFirstName(params[0]);
            author.setLastName(params[1]);

            this.authorRepo.saveAndFlush(author);

        }


    }

    @Override
    public int getAuthorCount() {
        return (int) this.authorRepo.count();
    }

    @Override
    public Author findAuthorById(Long id) {
        return this.authorRepo.getOne(id);
    }
}
