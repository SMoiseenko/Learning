package by.moiseenko.repository.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.repository.BookDAO;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Repository
public class BookDAOImpl implements BookDAO {
  private static final Logger LOG = LogManager.getLogger(BookDAOImpl.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public BookDAOImpl(@Qualifier("hibernateSessionFactoryJBoss") MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @SuppressWarnings(value = "unchecked")
  @Override
  public Book createBook(Book book) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    Query query = session.createQuery("from YearOfPublish where year =:param", YearOfPublish.class);
    query.setParameter("param", book.getYearOfPublish().getYear());
    List<YearOfPublish> yearOfPublishList = query.getResultList();
    if (yearOfPublishList.size() == 1)
      book.setYearOfPublish(session.load(YearOfPublish.class, yearOfPublishList.get(0).getId()));
    for (int i = 0; i < book.getAuthorsList().size(); i++) {
      Author author = session.load(Author.class, book.getAuthorsList().get(i).getId());
      author.getBooksList().add(book);
    }
    tx.commit();
    session.close();
    return book;
  }
}
