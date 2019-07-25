package by.moiseenko.service;

import by.moiseenko.entity.Book;
import by.moiseenko.entity.modelentity.BookModel;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface BookService {

  Book createBook(BookModel bookModel);
}
