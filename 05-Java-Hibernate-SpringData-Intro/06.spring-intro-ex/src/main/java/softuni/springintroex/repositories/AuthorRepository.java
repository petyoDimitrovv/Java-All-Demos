package softuni.springintroex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.springintroex.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
