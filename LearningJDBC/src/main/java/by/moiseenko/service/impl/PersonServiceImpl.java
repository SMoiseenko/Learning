package by.moiseenko.service.impl;

import by.moiseenko.model.Person;
import by.moiseenko.repository.ConnectionPool;
import by.moiseenko.repository.PersonDao;
import by.moiseenko.repository.impl.ApacheConnectionPool;
import by.moiseenko.service.PasswordCrypt;
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

  private ConnectionPool connectionPool;
  private PersonDao personDao;
  private PasswordCrypt passwordCrypt;

  public PersonServiceImpl(PersonDao personDao, PasswordCrypt passwordCrypt, ConnectionPool connectionPool) {
    this.personDao = personDao;
    this.passwordCrypt = passwordCrypt;
    this.connectionPool = connectionPool;
  }

  @Override
  // add validation person + exception if not valid
  public List<Person> getAllPersons() {
    List<Person> result = null;
    try (Connection connection = connectionPool.getConnection()) {
      result = new ArrayList<>();
      connection.setAutoCommit(false);
      LOG.debug("set autocommit false");
      personDao.setConnection(connection);
      result = personDao.getAllPersons();
      connection.commit();
      LOG.debug("commit query");
      connection.setAutoCommit(true);
      LOG.debug("set autocommit true");
    } catch (SQLException sqlE) {
      LOG.error("Problem with connection to DB. " + sqlE);
    }
    return result;
  }

  @Override
  public Person loginInSystem(String login, String password) {
    List<Person> personList = getAllPersons();
    return personList.stream()
        .filter(p -> p.getLogin().equals(login) && passwordCrypt.verifyHash(password, p.getPassword()))
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
    person.setPassword(passwordCrypt.hash(person.getPassword()));
    try (Connection connection = connectionPool.getConnection()) {
      connection.setAutoCommit(false);
      personDao.setConnection(connection);
      generatedID = personDao.createPerson(person);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException sqlE) {
      LOG.error("Problem with connection to DB. " + sqlE);
    }
    return generatedID;
  }

  @Override
  public Person findPerson(long id) {
    Person person = null;
    try(Connection connection = connectionPool.getConnection()){
      connection.setAutoCommit(false);
      personDao.setConnection(connection);
      person = personDao.findPerson(id);
      connection.commit();
      connection.setAutoCommit(true);
    }catch (SQLException sqlE){
      LOG.error(sqlE);
    }
    return person;
  }

  @Override
  public int updatePerson(Person person) {
    int updatedRaws = -1;
    try(Connection connection = connectionPool.getConnection()){
      connection.setAutoCommit(false);
      personDao.setConnection(connection);
      person.setPassword(passwordCrypt.hash(person.getPassword()));
      updatedRaws = personDao.updatePerson(person);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException sqlE){
      LOG.error(sqlE);
    }
    return updatedRaws;
  }

  @Override
  public void deletePerson(long id) {
    try(Connection connection = connectionPool.getConnection()){
      connection.setAutoCommit(false);
      personDao.setConnection(connection);
      personDao.deletePerson(id);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException sqlE){
      LOG.error(sqlE);
    }
  }
}
