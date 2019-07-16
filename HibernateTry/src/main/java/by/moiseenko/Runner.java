package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.entity.Author;
import by.moiseenko.service.AuthorService;
import by.moiseenko.service.impl.AuthorServiceImpl;
import by.moiseenko.utils.impl.HibernateSessionFactoryUtil;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
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
    AuthorService authorService = context.getBean(AuthorServiceImpl.class);
    List<Author> authorList = authorService.getAllAuthors();
    authorList.forEach(LOG::debug);
  }
}
