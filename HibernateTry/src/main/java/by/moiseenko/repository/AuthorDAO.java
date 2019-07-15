package by.moiseenko.repository;

import by.moiseenko.entity.Author;
import java.util.List;
import java.util.Set;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface AuthorDAO {

  void createAuthor(Author author);

  List<Author> getAllAuthors();

  Author findAuthorById(int id);

  void updateAuthor(Author author);
}
