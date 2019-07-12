package by.moiseenko.service;

import by.moiseenko.entity.Author;
import java.util.Set;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface AuthorService {
  Author create(Author author);

  Set<Author> getAllAuthors();
}
