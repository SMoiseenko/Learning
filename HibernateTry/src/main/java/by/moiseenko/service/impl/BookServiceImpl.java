package by.moiseenko.service.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.entity.modelentity.BookModel;
import by.moiseenko.repository.BookDAO;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Service
public class BookServiceImpl implements BookService {
  private static final Logger LOG = LogManager.getLogger(BookServiceImpl.class.getName());

  private BookDAO bookDAO;

  @Autowired
  public BookServiceImpl(BookDAO bookDAO) {
    this.bookDAO = bookDAO;
  }

  @Override
  public Book createBook(BookModel bookModel) {
    return bookDAO.createBook(ModelBookConverter.convertFromModelBook(bookModel));
  }
}
