package by.moiseenko.repository.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.repository.AuthorDAO;
import by.moiseenko.utils.MySessionFactory;
import java.util.HashSet;
import java.util.Set;
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
  public Author createAuthor(Author author) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    Author savedAuthor = (Author) session.save(author);
    tx.commit();
    session.close();
    return savedAuthor;
  }

  @Override
  public Set<Author> getAllAuthors() {
    Session session = sessionFactory.getSessionFactory().openSession();
    Set<Author> result = new HashSet<>(session.createQuery("from Author", Author.class).list());
    session.close();
    return result;
  }
}
