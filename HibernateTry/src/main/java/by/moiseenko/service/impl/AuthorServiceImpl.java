package by.moiseenko.service.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.repository.AuthorDAO;
import by.moiseenko.service.AuthorService;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Service
public class AuthorServiceImpl implements AuthorService {

  private static final Logger LOG = LogManager.getLogger(AuthorServiceImpl.class.getName());

  private AuthorDAO authorDAO;

  @Autowired
  public AuthorServiceImpl(AuthorDAO authorDAO) {
    this.authorDAO = authorDAO;
  }

  @Override
  public void create(Author author) {
    authorDAO.createAuthor(author);
  }

  @Override
  public List<Author> getAllAuthors() {
    return authorDAO.getAllAuthors();
  }

  @Override
  public Author getAuthorById(int id) {
    return authorDAO.findAuthorById(id);
  }

  @Override
  public void updateAuthor(Author author) {
    authorDAO.updateAuthor(author);
  }
}
