package softuni.springintroex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.springintroex.entities.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
