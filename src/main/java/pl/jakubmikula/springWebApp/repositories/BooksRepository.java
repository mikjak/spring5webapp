package pl.jakubmikula.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakubmikula.springWebApp.model.Book;

public interface BooksRepository extends CrudRepository<Book, Long> {
}
