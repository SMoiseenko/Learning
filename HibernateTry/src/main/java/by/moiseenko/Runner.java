package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.entity.Author;
import by.moiseenko.utils.HibernateSessionFactoryUtil;
import by.moiseenko.utils.MySessionFactory;
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
    MySessionFactory sessionFactory =
        context.getBean("hibernateSessionBean", HibernateSessionFactoryUtil.class);

    Session session = sessionFactory.getSessionFactory().openSession();
    session.createQuery("FROM Author ", Author.class).list();
    session.close();
  }
}
