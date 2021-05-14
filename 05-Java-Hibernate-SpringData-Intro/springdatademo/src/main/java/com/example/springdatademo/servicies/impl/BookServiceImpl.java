package com.example.springdatademo.servicies.impl;

import com.example.springdatademo.entities.Author;
import com.example.springdatademo.entities.Book;
import com.example.springdatademo.entities.Category;
import com.example.springdatademo.entities.enums.AgeRestriction;
import com.example.springdatademo.entities.enums.EditionType;
import com.example.springdatademo.repositories.BookRepo;
import com.example.springdatademo.servicies.AuthorService;
import com.example.springdatademo.servicies.BookService;
import com.example.springdatademo.servicies.CategoryService;
import com.example.springdatademo.util.FileUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class BookServiceImpl implements BookService {
    private final static String BOOK_FILE_PATH = "src/main/resources/files/books.txt";
    private final BookRepo bookRepo;
    private final FileUtil fileUtil;
    private final AuthorService authorService;
    private final CategoryService categoryService;


    public BookServiceImpl(BookRepo bookRepo, FileUtil fileUtil, AuthorService authorService, CategoryService categoryService) {
        this.bookRepo = bookRepo;
        this.fileUtil = fileUtil;
        this.authorService = authorService;
        this.categoryService = categoryService;
    }

    @Override
    public void seedBooks() throws IOException {
        if (bookRepo.count() != 0) {
            return;
        }

        String[] books = fileUtil.fileContext(BOOK_FILE_PATH);
        Arrays.stream(books).forEach(r -> {
            String[] params = r.split("\\s+");

            Author author = this.getRandomAuthor();

            EditionType editionType = EditionType.values()[Integer.parseInt(params[0])];

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate releaseDate = LocalDate.parse(params[1], formatter);

            int copies = Integer.parseInt(params[2]);

            BigDecimal price = new BigDecimal(params[3]);

            AgeRestriction ageRestriction =
                    AgeRestriction.values()[Integer.parseInt(params[4])];

            String title = this.getTitle(params);

            Set<Category> categories = this.getRandomCategories();

            Book book = new Book();
            book.setAuthor(author);
            book.setEditionType(editionType);
            book.setReleaseDate(releaseDate);
            book.setCopies(copies);
            book.setPrice(price);
            book.setAgeRestriction(ageRestriction);
            book.setTitle(title);
            book.setCategories(categories);

            this.bookRepo.saveAndFlush(book);
        });
    }


    private Set<Category> getRandomCategories() {
        Set<Category> result = new HashSet<>();
        Random random = new Random();
        int bound = random.nextInt(3) + 1;

        for (int i = 1; i <= bound; i++) {
            int categoryId = random.nextInt(8) + 1;
            result.add(this.categoryService.getCategoryById((long) categoryId));
        }

        return result;
    }

    private String getTitle(String[] params) {
        StringBuilder sb = new StringBuilder();

        for (int i = 5; i < params.length; i++) {
            sb.append(params[i])
                    .append(" ");
        }

        return sb.toString().trim();
    }

    private Author getRandomAuthor() {
        Random random = new Random();

        int randomID = random.nextInt((int) this.authorService.getAuthorCount()) + 1;

        return this.authorService.findAuthorById((long) randomID);
    }
}
