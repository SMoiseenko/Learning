package by.moiseenko.utils;

import org.hibernate.SessionFactory;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface MySessionFactory {
  SessionFactory getSessionFactory();

  void shutdown();
}
