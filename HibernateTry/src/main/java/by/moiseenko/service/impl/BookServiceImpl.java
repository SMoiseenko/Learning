package by.moiseenko.service.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.entity.modelentity.BookModel;
import by.moiseenko.service.BookService;
import by.moiseenko.utils.ModelBookConverter;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Service
public class BookServiceImpl implements BookService {
  private static final Logger LOG = LogManager.getLogger(BookServiceImpl.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public BookServiceImpl(MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @SuppressWarnings(value = "unchecked")
  @Override
  public Book createBook(BookModel bookModel) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    Book book = ModelBookConverter.convertFromModelBook(bookModel);
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
