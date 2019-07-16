package by.moiseenko.utils.impl;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.Country;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.utils.MySessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Component
public class HibernateSessionFactoryUtil implements MySessionFactory {

  private static final Logger LOG =
      LogManager.getLogger(HibernateSessionFactoryUtil.class.getName());

  private SessionFactory sessionFactory;

  public HibernateSessionFactoryUtil() {}

  public HibernateSessionFactoryUtil(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public SessionFactory getSessionFactory() {
    if (sessionFactory == null) {

      Configuration configuration = new Configuration().configure();
      configuration.addAnnotatedClass(Author.class);
      configuration.addAnnotatedClass(Book.class);
      configuration.addAnnotatedClass(YearOfPublish.class);
      configuration.addAnnotatedClass(Country.class);

      StandardServiceRegistryBuilder builder =
          new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      sessionFactory = configuration.buildSessionFactory(builder.build());
    }
    return sessionFactory;
  }
}
