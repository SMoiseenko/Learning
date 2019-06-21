package by.moiseenko.jdbc;

import by.moiseenko.Runner;
import by.moiseenko.entity.Person;
import by.moiseenko.jdbc.impl.DataSource;
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

  List<Person> getAllPersons();

  long savePerson(Person person);

  Person findPerson(long id);

  long updatePerson(long id, Person person);

  void deletePerson(long id);

  default void deleteDuplicatesBySQLProcedure(){
    Logger LOG = LogManager.getLogger(PersonDao.class.getName());
    DataSource ds = DataSource.getInstance(Runner.mySQL_prop);
    try(Connection conn = ds.getConnection()){
      CallableStatement cs = conn.prepareCall("{CALL delete_dublicates_from_persons()}");
      cs.execute();
      LOG.debug("Procedure execute success!");
    }catch (SQLException sqlE){
     LOG.error(sqlE);
    }
  }
}
