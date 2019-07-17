package by.moiseenko.repository;

import by.moiseenko.entity.Author;
import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface AuthorDAO {

  void createAuthor(Author author);

  List<Author> getAllAuthors();

  Author findAuthorById(Long id);

  void updateAuthor(Author author);

  void deleteAuthor(Author author);
}
