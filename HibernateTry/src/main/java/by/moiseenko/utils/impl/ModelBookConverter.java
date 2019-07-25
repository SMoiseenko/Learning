package by.moiseenko.utils.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.entity.modelentity.BookModel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.Assert;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ModelBookConverter {

  private static final Logger LOG = LogManager.getLogger(ModelBookConverter.class.getName());

  public static Book convertFromModelBook(BookModel bookModel) {
    Assert.notNull(bookModel, "oops, bookmodel is null");
    Book book = new Book();
    book.setName(bookModel.getName());
    book.setYearOfPublish(new YearOfPublish(LocalDate.parse(bookModel.getYearOfPublish())));
    List<Author> authors = new ArrayList<>();
    bookModel.getListAuthorsId().forEach((id) -> authors.add(new Author(Long.valueOf(id))));
    book.setAuthorsList(authors);
    return book;
  }
}
