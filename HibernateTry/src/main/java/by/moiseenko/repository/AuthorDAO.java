package by.moiseenko.repository;

import by.moiseenko.entity.Author;
import java.util.Set;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface AuthorDAO {

  void createAuthor(Author author);

  Set<Author> getAllAuthors();


}
