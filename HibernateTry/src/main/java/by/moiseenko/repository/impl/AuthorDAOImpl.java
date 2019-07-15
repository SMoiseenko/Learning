package by.moiseenko.repository.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.repository.AuthorDAO;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Repository
public class AuthorDAOImpl implements AuthorDAO {

  private static final Logger LOG = LogManager.getLogger(AuthorDAOImpl.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public AuthorDAOImpl(MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public void createAuthor(Author author) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(author);
    LOG.warn(author.getId());
    tx.commit();
    session.close();
  }

  @Override
  public List<Author> getAllAuthors() {
    Session session = sessionFactory.getSessionFactory().openSession();
    List<Author> result = session.createQuery("from Author", Author.class).list();
    session.close();
    return result;
  }

  @Override
  public Author findAuthorById(int id) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Author result = session.get(Author.class, id);
    session.close();
    return result;
  }

  @Override
  public void updateAuthor(Author updateAuthor) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    Author storedAuthor = session.get(Author.class, updateAuthor.getId());
    storedAuthor.setName(updateAuthor.getName());
    storedAuthor.setCountryOfBorn(updateAuthor.getCountryOfBorn());
    session.update(storedAuthor);
    tx.commit();
    session.close();
  }
}
