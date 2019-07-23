package by.moiseenko.utils.impl;

import by.moiseenko.utils.MySessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Component
public class HibernateSessionFactoryJBoss implements MySessionFactory {
  private static final Logger LOG =
      LogManager.getLogger(HibernateSessionFactoryJBoss.class.getName());

  private SessionFactory sessionFactory = buildSessionFactory();

  private  SessionFactory buildSessionFactory(){
    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    try{
      sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    } catch (Exception e){
      StandardServiceRegistryBuilder.destroy(registry);
      throw  new ExceptionInInitializerError("Initial SessionFactory faild" + e);
    }
    return sessionFactory;
  }

  @Override
  public  SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public void shutdown(){
    getSessionFactory().close();
  }
}
