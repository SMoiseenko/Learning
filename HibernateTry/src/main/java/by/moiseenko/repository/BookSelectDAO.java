package by.moiseenko.repository;

import by.moiseenko.entity.Book;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface BookSelectDAO {

  List<Book> selectBetweenDates(LocalDate from, LocalDate till);

}
