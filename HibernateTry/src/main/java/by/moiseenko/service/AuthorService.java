package by.moiseenko.service;

import by.moiseenko.entity.Author;
import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface AuthorService {

  void create(Author author);

  List<Author> getAllAuthors();

  Author getAuthorById(int id);

  void updateAuthor(Author author);

  void deleteAuthor(Author author);
}
