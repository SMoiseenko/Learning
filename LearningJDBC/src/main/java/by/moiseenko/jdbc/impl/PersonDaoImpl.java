package by.moiseenko.jdbc.impl;

import by.moiseenko.entity.Person;
import by.moiseenko.jdbc.PersonDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PersonDaoImpl implements PersonDao {

  private static final Logger LOG = LogManager.getLogger(PersonDaoImpl.class.getName());

  private static final String sqlCreate =
      "INSERT INTO learning_jdbc.persons (login, password, first_name, last_name, date_of_birth, salary)VALUES (?,?,?,?,?,?)";
  private static final String sqlSelect = "SELECT * from learning_jdbc.persons where id = ?";
  private static final String sqlUpdate = "";
  private static final String sqlDelete = "";
  private DataSource ds;

  public PersonDaoImpl(DataSource ds) {
    this.ds = ds;
  }

  @Override
  public void createPerson(Person person) {
    if (person != null) {
      try (Connection conn = ds.getConnection(); ) {
        PreparedStatement ps = conn.prepareStatement(sqlCreate);
        ps.setString(1, person.getLogin());
        ps.setString(2, person.getPassword());
        ps.setString(3, person.getFirstName());
        ps.setString(4, person.getLastName());
        ps.setDate(5, Date.valueOf(person.getDateOfBirth()));
        ps.setBigDecimal(6, person.getSalary());
        int update = ps.executeUpdate();
        LOG.debug(update + " was added");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }
    } else throw new IllegalArgumentException();
  }

  @Override
  public Person retrievePerson(long id) {
    Person person = null;
    try (Connection conn = ds.getConnection()) {
      PreparedStatement ps = conn.prepareStatement(sqlSelect);
      ps.setLong(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        person = new Person();
        person.setId(rs.getLong("id"));
        person.setLogin(rs.getString("login"));
        person.setPassword(rs.getString("password"));
        person.setFirstName(rs.getString("first_name"));
        person.setLastName(rs.getString("last_name"));
        person.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
        person.setSalary(rs.getBigDecimal("salary"));
      }
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    if (person != null) return person;
    else throw new IllegalArgumentException();
  }

  @Override
  public void updatePerson(Person person) {}

  @Override
  public void deletePerson(long id) {}
}
