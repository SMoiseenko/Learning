package by.moiseenko.jdbc.impl;

import by.moiseenko.entity.Person;
import by.moiseenko.jdbc.PersonDao;
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

  private static final String SQL_CREATE =
      "INSERT INTO learning_jdbc.persons (login, password, first_name, last_name, date_of_birth, salary)VALUES (?,?,?,?,?,?)";
  private static final String SQL_SELECT =
      "SELECT * FROM learning_jdbc.persons WHERE id = ?";
  private static final String SQL_UPDATE =
      "UPDATE learning_jdbc.persons SET login=?, password=?, first_name=?, last_name=?, date_of_birth=?, salary=? WHERE id =?";
  private static final String SQL_DELETE = "DELETE FROM learning_jdbc.persons WHERE id = ?";
  private DataSource ds;

  public PersonDaoImpl(DataSource ds) {
    this.ds = ds;
  }

  @Override
  public long savePerson(Person person) {
    long createdId = -1;
    if (person != null) {
      try (Connection conn = ds.getConnection(); ) {
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
    try (Connection conn = ds.getConnection()) {
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
      try (Connection conn = ds.getConnection()) {
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
    try (Connection conn = ds.getConnection()) {
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
    try (Connection conn = ds.getConnection()) {
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
    person.setId(resultSet.getLong("id"));
    person.setLogin(resultSet.getString("login"));
    person.setPassword(resultSet.getString("password"));
    person.setFirstName(resultSet.getString("first_name"));
    person.setLastName(resultSet.getString("last_name"));
    person.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
    person.setSalary(resultSet.getBigDecimal("salary"));
  }
}
