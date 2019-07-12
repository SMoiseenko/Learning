package by.moiseenko.service;

import by.moiseenko.entity.Author;
import java.util.Set;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface AuthorService {
  void create(Author author);

  Set<Author> getAllAuthors();
}
