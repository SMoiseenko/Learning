package by.moiseenko.repository;

import by.moiseenko.Runner;
import by.moiseenko.model.Person;
import by.moiseenko.repository.impl.ConnectorDB;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface PersonDao {

  List<Person> getAllPersons() throws SQLException;

  long createPerson(Person person) throws SQLException;

  Person findPerson(long id) throws SQLException;

  int updatePerson(Person person)throws SQLException;

  void deletePerson(long id) throws SQLException;

  default void deleteDuplicatesBySQLProcedure() {
    Logger LOG = LogManager.getLogger(PersonDao.class.getName());
    ConnectorDB ds = ConnectorDB.getInstance(Runner.mySQL_prop);
    try (Connection conn = ds.getConnection()) {
      CallableStatement cs = conn.prepareCall("{CALL delete_dublicates_from_persons()}");
      cs.execute();
      LOG.debug("Procedure execute success!");
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
  }
}
