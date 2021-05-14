package softuni.springintroex.controlers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import softuni.springintroex.servicies.AuthorService;
import softuni.springintroex.servicies.BookService;
import softuni.springintroex.servicies.CategoryService;

@Controller
public class AppController implements CommandLineRunner {

    private final CategoryService categoryService;
    private final AuthorService authorService;
    private final BookService bookService;

    public AppController(CategoryService categoryService, AuthorService authorService, BookService bookService) {
        this.categoryService = categoryService;
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        this.categoryService.seedCategories();
        this.authorService.seedAuthors();
        this.bookService.seedBooks();


    }
}
