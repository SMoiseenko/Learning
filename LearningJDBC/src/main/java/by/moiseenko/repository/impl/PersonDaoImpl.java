package by.moiseenko.repository.impl;

import by.moiseenko.model.Person;
import by.moiseenko.repository.PersonDao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PersonDaoImpl implements PersonDao {

  private static final Logger LOG = LogManager.getLogger(PersonDaoImpl.class.getName());

  private Connection connection;

  public static final String SQL_CREATE_INTO_PERSON =
      "INSERT INTO learning_jdbc.persons (person_login, person_password, person_first_name, person_last_name, person_date_of_birth, person_salary)VALUES (?,?,?,?,?,?)";
  public static final String SQL_SELECT_FROM_PERSON =
      "SELECT * FROM learning_jdbc.persons WHERE person_id = ?";
  public static final String SQL_SELECT_ALL_FROM = "SELECT * FROM learning_jdbc.persons";
  public static final String SQL_UPDATE_INTO_PERSON =
      "UPDATE learning_jdbc.persons SET person_login=?, person_password=?, person_first_name=?, person_last_name=?, person_date_of_birth=?, person_salary=? WHERE person_id =?";
  public static final String SQL_DELETE_FROM_PERSON =
      "DELETE FROM learning_jdbc.persons WHERE person_id = ?";

  public PersonDaoImpl() {
  }

  @Override
  public long createPerson(Person person) throws SQLException {
    long createdId = -1;
    if (person != null) { // needed??? if yes - reaction?
      try (PreparedStatement ps =
          connection.prepareStatement(
              SQL_CREATE_INTO_PERSON, PreparedStatement.RETURN_GENERATED_KEYS)) {
        prepareStatementForCreateUpdate(person, ps);
        int rawsAdded = ps.executeUpdate();
        LOG.debug(rawsAdded + " was added.");
        ResultSet rs = ps.getGeneratedKeys();
        while (rs != null && rs.next()) {
          createdId = rs.getBigDecimal(1).longValue();
          LOG.debug(createdId + " Id was generated.");
        }
      } catch (SQLException sqlE) {
        connection.rollback();
        connection.setAutoCommit(true);
        throw sqlE;
      }
    }
    return createdId;
  }

  @Override
  public Person findPerson(long id) throws SQLException {
    Person person = null;
    try (PreparedStatement ps = connection.prepareStatement(SQL_SELECT_FROM_PERSON)) {
      ps.setLong(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        person = personMapper(rs);
      }
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      throw sqlE;
    }
    if (person != null) {
      LOG.debug(
          String.format(
              "%d %s %s was found.", person.getId(), person.getFirstName(), person.getLastName()));
    }
    return person;
  }

  @Override
  public int updatePerson(Person person) throws SQLException {
    int result = -1;
    if (person != null) {
      try (PreparedStatement ps = connection.prepareStatement(SQL_UPDATE_INTO_PERSON)) {
        prepareStatementForCreateUpdate(person, ps);
        ps.setBigDecimal(7, new BigDecimal(person.getId()));
        result = ps.executeUpdate();
        LOG.debug(result + " was updated.");

      } catch (SQLException sqlE) {
        connection.rollback();
        connection.setAutoCommit(true);
        throw sqlE;
      }
    }
    return result;
  }

  @Override
  public List<Person> getAllPersons() throws SQLException {
    List<Person> personList = null;
    try (PreparedStatement ps = connection.prepareStatement(SQL_SELECT_ALL_FROM)) {
      personList = new ArrayList<>();
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        personList.add(personMapper(rs));
      }
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      LOG.error(sqlE);
    }
    return personList;
  }

  @Override
  public void deletePerson(long id) throws SQLException {
    try (PreparedStatement ps = connection.prepareStatement(SQL_DELETE_FROM_PERSON)) {
      ps.setBigDecimal(1, new BigDecimal(id));
      int raws = ps.executeUpdate();
      LOG.debug(raws + " was deleted.");
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      LOG.error(sqlE);
    }
  }

  @Override
  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  private void prepareStatementForCreateUpdate(Person person, PreparedStatement ps)
      throws SQLException {
    ps.setString(1, person.getLogin());
    ps.setString(2, person.getPassword());
    ps.setString(3, person.getFirstName());
    ps.setString(4, person.getLastName());
    ps.setDate(5, Date.valueOf(person.getDateOfBirth()));
    ps.setBigDecimal(6, person.getSalary());
  }

  private Person personMapper(ResultSet resultSet) throws SQLException {
    Person person = new Person();
    person.setId(resultSet.getBigDecimal("person_id").longValue());
    person.setLogin(resultSet.getString("person_login"));
    person.setPassword(resultSet.getString("person_password"));
    person.setFirstName(resultSet.getString("person_first_name"));
    person.setLastName(resultSet.getString("person_last_name"));
    person.setDateOfBirth(resultSet.getDate("person_date_of_birth").toLocalDate());
    person.setSalary(resultSet.getBigDecimal("person_salary"));
    return person;
  }
}
