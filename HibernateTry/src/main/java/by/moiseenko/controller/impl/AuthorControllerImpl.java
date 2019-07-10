package by.moiseenko.controller.impl;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.controller.AuthorController;
import by.moiseenko.entity.Author;
import by.moiseenko.utils.HibernateSessionFactoryUtil;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
public class AuthorControllerImpl implements AuthorController {

  private static final Logger LOG = LogManager.getLogger(AuthorControllerImpl.class.getName());

  @Override
  @GetMapping("/allAuthors")
  public String getAllAuthors(Model model) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    MySessionFactory sessionFactory =
        context.getBean("hibernateSessionBean", HibernateSessionFactoryUtil.class);
    Session session = sessionFactory.getSessionFactory().openSession();
    List<Author> authorList = session.createQuery("FROM Author", Author.class).list();
    model.addAttribute("authorList", authorList);
    return "/allAuthors";
  }

  @GetMapping("/")
  public String index() {
    return "/index";
  }
}
