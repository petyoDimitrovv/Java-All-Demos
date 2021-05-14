package softuni.springintroex.servicies.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import softuni.springintroex.controlers.utils.FileUtil;
import softuni.springintroex.entities.Author;
import softuni.springintroex.entities.Category;
import softuni.springintroex.entities.book.AgeRestriction;
import softuni.springintroex.entities.book.Book;
import softuni.springintroex.entities.book.EditionType;
import softuni.springintroex.repositories.BookRepository;
import softuni.springintroex.servicies.AuthorService;
import softuni.springintroex.servicies.BookService;
import softuni.springintroex.servicies.CategoryService;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static softuni.springintroex.constants.GlobalConstants.*;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private final AuthorService authorService;
    private final BookRepository bookRepository;
    private final FileUtil fileUtil;
    private final CategoryService categoryService;

    public BookServiceImpl(AuthorService authorService, BookRepository bookRepository, FileUtil fileUtil, CategoryService categoryService) {
        this.authorService = authorService;
        this.bookRepository = bookRepository;
        this.fileUtil = fileUtil;
        this.categoryService = categoryService;
    }


    @Override
    public void seedBooks() throws IOException {
        if(this.bookRepository.count() != 0){
            return;
        }

        String[] fileContent = this.fileUtil.readFileContent(BOOK_FILE_PATH);
        Arrays.stream(fileContent).forEach(r -> {
            String[] params = r.split("\\s+");
            Author author = this.getRandomAuthor();
            EditionType editionType = EditionType.values()[Integer.parseInt(params[0])];
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate releaseDate = LocalDate.parse(params[1],formatter);
            int copies = Integer.parseInt(params[2]);
            BigDecimal price = new BigDecimal(params[3]);
            AgeRestriction ageRestriction = AgeRestriction.values()[Integer.parseInt(params[4])];

            String title = this.getTitle(params);

            Set<Category> categories = this.getRandomCategories();

            Book book = new Book();
            book.setAuthor(author);
            book.setEditionType(editionType);
            book.getReleaseDate(releaseDate);
            book.setCopies(copies);
            book.setPrice(price);
            book.setAgeRestriction(ageRestriction);
            book.setTitle(title);
            book.setCategories(categories);

            this.bookRepository.saveAndFlush(book);

        });

    }

    private Set<Category> getRandomCategories() {
       Set<Category> result = new HashSet<>();
        Random random = new Random();
        int bound = random.nextInt(3) +1;



        for (int i = 1; i <= bound; i++) {
            int categoryId = random.nextInt(8) + 1;
            result.add(this.categoryService.getCategoryById((long) categoryId));

        }
        return result;
    }

    private String getTitle(String[] param) {
        StringBuilder sb = new StringBuilder();
        for (int i = 5; i < param.length; i++) {
            sb.append(param[i])
                    .append(" ");
        }
        return sb.toString().trim();
    }

    private Author getRandomAuthor() {
        Random random = new Random();
        int randomId = random.nextInt(this.authorService.getAuthorCount()) + 1;

        return this.authorService.findAuthorById((long) randomId);

    }
}
