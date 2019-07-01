package by.moiseenko.service.impl;

import by.moiseenko.model.Person;
import by.moiseenko.repository.PersonDao;
import by.moiseenko.repository.impl.ApacheConnectionPool;
import by.moiseenko.repository.impl.PersonDaoImpl;
import by.moiseenko.service.PersonService;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PersonServiceImpl implements PersonService {

  private static final Logger LOG = LogManager.getLogger(PersonServiceImpl.class.getName());

  private PersonDao personDao;

  public PersonServiceImpl(PersonDao personDao) {
    this.personDao = personDao;
  }

  @Override
  //add validation person + exception if not valid
  public List<Person> getAllPersons() {
    List<Person> result = null;
    try (Connection connection = ApacheConnectionPool.getConnection()) {
      result = new ArrayList<>();
      connection.setAutoCommit(false);
      personDao.setConnection(connection);
      result = personDao.getAllPersons();
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException sqlE) {
      LOG.error("Problem with connection to DB. " + sqlE);
    }
    return result;
  }

  @Override
  public Person loginInSystem(String login, String password) {
    List<Person> personList = getAllPersons();
    return personList.stream()
        .filter(p -> p.getLogin().equals(login) && p.getPassword().equals(password))
        .collect(
            Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                  if (list.size() != 1) {
                    throw new IllegalArgumentException("Wrong login or password");
                  }
                  return list.get(0);
                }));
  }

  @Override
  public long createPerson(Person person) {
    long generatedID = -1;
    try(Connection connection = ApacheConnectionPool.getConnection()){
      connection.setAutoCommit(false);
//      PersonDao personDao = new PersonDaoImpl(connection);
      generatedID = personDao.createPerson(person);
      connection.commit();
      connection.setAutoCommit(true);
    }catch (SQLException sqlE){
      LOG.error("Problem with connection to DB. " + sqlE);
    }
    return generatedID;
  }

  @Override
  public Person findPerson(long id) {
    return null;
  }

  @Override
  public int updatePerson(Person person) {
    return -1;
  }

  @Override
  public void deletePerson(long id) {}
}
