package by.moiseenko.repository.impl;

import by.moiseenko.entity.Person;
import by.moiseenko.repository.PersonDAO;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class PersonDAOImpl implements PersonDAO {

  private static final Logger LOG = LogManager.getLogger(PersonDAOImpl.class.getName());
  private MySessionFactory sessionFactory;

  public PersonDAOImpl(MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public Person create(Person person) {
    return null;
  }

  @Override
  public Person find(long id) {
    return null;
  }

  @Override
  public void update(Person person) {}

  @Override
  public void delete(long id) {}

  @Override
  public List<Person> getAll() {
      return sessionFactory.getSessionFactory().openSession().createQuery("from Person", Person.class).list();

  }
}
