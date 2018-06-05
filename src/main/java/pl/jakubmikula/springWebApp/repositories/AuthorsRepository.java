package pl.jakubmikula.springWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.jakubmikula.springWebApp.model.Author;

public interface AuthorsRepository extends CrudRepository<Author, Long> {
}
