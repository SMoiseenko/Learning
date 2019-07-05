package by.moiseenko.utils;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class HibernateSessionFactoryUtil implements MySessionFactory {

  private static final Logger LOG =
      LogManager.getLogger(HibernateSessionFactoryUtil.class.getName());

  private SessionFactory sessionFactory;

  public HibernateSessionFactoryUtil() {
  }

  public HibernateSessionFactoryUtil(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public SessionFactory getSessionFactory() {
    if (sessionFactory == null) {

      Configuration configuration = new Configuration().configure();
      configuration.addAnnotatedClass(Person.class);
      configuration.addAnnotatedClass(Product.class);
      StandardServiceRegistryBuilder builder =
          new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      sessionFactory = configuration.buildSessionFactory(builder.build());
    }
    return sessionFactory;
  }
}
