package softuni.springintroex.servicies.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.springintroex.constants.GlobalConstants;
import softuni.springintroex.controlers.utils.FileUtil;
import softuni.springintroex.entities.Author;
import softuni.springintroex.repositories.AuthorRepository;
import softuni.springintroex.servicies.AuthorService;

import java.io.IOException;
import java.util.Arrays;

import static softuni.springintroex.constants.GlobalConstants.*;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final FileUtil fileUtil;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository, FileUtil fileUtil) {
        this.authorRepository = authorRepository;
        this.fileUtil = fileUtil;
    }


    @Override
    public void seedAuthors() throws IOException {
        if(this.authorRepository.count() != 0){
            return;
        }

        String[] fileContent = this.fileUtil.readFileContent(AUTHOR_FILE_PATH);

        Arrays.stream(fileContent)
                .forEach(r -> {
                    String[] params = r.split("\\s+");
                    Author author = new Author(params[0],params[1]);

                    this.authorRepository.saveAndFlush(author);
                });

    }

    @Override
    public int getAuthorCount() {
        return (int) this.authorRepository.count();
    }

    @Override
    public Author findAuthorById(Long id) {
        return this.authorRepository.getOne(id);
    }
}
