package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.configuration.WebConfig;
import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.Country;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.utils.HibernateSessionFactoryUtil;
import by.moiseenko.utils.MySessionFactory;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {
    //
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    MySessionFactory sessionFactory =
        context.getBean("hibernateSessionBean", HibernateSessionFactoryUtil.class);

    Author author = new Author();
    author.setName("Yanka Kupala");
    author.setCountryOfBorn(Country.BELARUS);

    Book book = new Book();
    book.setName("Best poems");

    YearOfPublish yearOfPublish = new YearOfPublish();
    yearOfPublish.setYear(Year.parse("1945", DateTimeFormatter.ofPattern("y")));
    book.setYearOfPublish(yearOfPublish);



    Set<Book> kupalaBooks = new HashSet<>();
    kupalaBooks.add(book);
    author.setBooksSet(kupalaBooks);
    Set<Author> authorSet = new HashSet<>();
    authorSet.add(author);
    book.setAuthorsSet(authorSet);



    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();

    session.persist(author);
    transaction.commit();
    session.close();

  }
}
