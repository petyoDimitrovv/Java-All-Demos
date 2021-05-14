package softuni.springintroex.servicies;

import softuni.springintroex.entities.Author;

import java.io.IOException;

public interface AuthorService {
    void seedAuthors() throws IOException;

    int getAuthorCount();

    Author findAuthorById(Long id);
}
