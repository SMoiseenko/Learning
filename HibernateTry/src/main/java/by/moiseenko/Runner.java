package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.entity.Author;
import by.moiseenko.entity.Country;
import by.moiseenko.service.AuthorService;
import by.moiseenko.service.impl.AuthorServiceImpl;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    Author markTwain = authorService.getAuthorById(9L);
    Country jamaika = new Country();
    jamaika.setName("Ямайка");
    markTwain.setCountryOfBorn(jamaika);
    authorService.updateAuthor(markTwain);
    List<Author> authorList = authorService.getAllAuthors();
    authorList.forEach(LOG::debug);
  }
}
