package by.moiseenko.repository.impl;

import by.moiseenko.model.Person;
import by.moiseenko.repository.PersonDao;
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

  private ConnectorDB connectorDB;

  private static final String SQL_CREATE =
      "INSERT INTO learning_jdbc.persons (person_login, person_password, person_first_name, person_last_name, person_date_of_birth, person_salary)VALUES (?,?,?,?,?,?)";
  private static final String SQL_SELECT =
      "SELECT * FROM learning_jdbc.persons WHERE person_id = ?";
  private static final String SQL_UPDATE =
      "UPDATE learning_jdbc.persons SET person_login=?, person_password=?, person_first_name=?, person_last_name=?, person_date_of_birth=?, person_salary=? WHERE person_id =?";
  private static final String SQL_DELETE = "DELETE FROM learning_jdbc.persons WHERE person_id = ?";


  public PersonDaoImpl(ConnectorDB connectorDB) {
    this.connectorDB = connectorDB;
  }

  @Override
  public long savePerson(Person person) {
    long createdId = -1;
    if (person != null) {
      try (Connection conn = connectorDB.getConnection(); ) {
        PreparedStatement ps =
            conn.prepareStatement(SQL_CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
        prepareStatementForCreateUpdate(person, ps);
        int rawsAdded = ps.executeUpdate();
        LOG.debug(rawsAdded + " was added.");
        ResultSet rs = ps.getGeneratedKeys();
        while (rs != null && rs.next()) {
          createdId = rs.getLong(1);
          LOG.debug(createdId + " Id was generated.");
        }
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }
    }
    if (createdId != -1) return createdId;
    else throw new IllegalArgumentException();
  }

  @Override
  public Person findPerson(long id) {
    Person person = null;
    try (Connection conn = connectorDB.getConnection()) {
      PreparedStatement ps = conn.prepareStatement(SQL_SELECT);
      ps.setLong(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        person = new Person();
        mapPersonFromResultSet(person, rs);
      }
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    if (person != null) return person;
    else throw new IllegalArgumentException("WRONG LOGIN OR PASSWORD");
  }

  @Override
  public long updatePerson(long id, Person person) {
    long updatedID = -1;
    if (person != null) {
      try (Connection conn = connectorDB.getConnection()) {
        PreparedStatement ps =
            conn.prepareStatement(SQL_UPDATE, PreparedStatement.RETURN_GENERATED_KEYS);
        prepareStatementForCreateUpdate(person, ps);
        ps.setLong(7, id);
        ResultSet rs = ps.getGeneratedKeys();
        while(rs!= null && rs.next()){
          updatedID = rs.getLong(1);
        }
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }
    }
    if (updatedID != -1) return updatedID;
    else throw new IllegalArgumentException();
  }

  @Override
  public List<Person> getAllPersons() {
    List<Person> personList = null;
    Person person = null;
    try (Connection conn = connectorDB.getConnection()) {
      PreparedStatement ps = conn.prepareStatement("SELECT * FROM learning_jdbc.persons");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        if (personList == null) personList = new ArrayList<>();
        person = new Person();
        mapPersonFromResultSet(person, rs);
        personList.add(person);
      }
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    if (personList != null) {
      return personList;
    } else throw new IllegalArgumentException("DATABASE IS EMPTY");
  }

  @Override
  public void deletePerson(long id) {
    try (Connection conn = connectorDB.getConnection()) {
      PreparedStatement ps = conn.prepareStatement(SQL_DELETE);
      int raws = ps.executeUpdate();
      LOG.debug(raws + " was deleted.");
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
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

  private void mapPersonFromResultSet(Person person, ResultSet resultSet) throws SQLException {
    person.setId(resultSet.getBigDecimal("person_id").longValue());
    person.setLogin(resultSet.getString("person_login"));
    person.setPassword(resultSet.getString("person_password"));
    person.setFirstName(resultSet.getString("person_first_name"));
    person.setLastName(resultSet.getString("person_last_name"));
    person.setDateOfBirth(resultSet.getDate("person_date_of_birth").toLocalDate());
    person.setSalary(resultSet.getBigDecimal("person_salary"));
  }
}
