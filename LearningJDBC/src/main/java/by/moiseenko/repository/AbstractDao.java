package by.moiseenko.repository;

import by.moiseenko.model.Entity;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public abstract class AbstractDao<K, E extends Entity> {
  private static final Logger LOG = LogManager.getLogger(AbstractDao.class.getName());
  protected Connection connection;

  public AbstractDao(Connection connection) {
    this.connection = connection;
  }

  public abstract List<E> findAll();

  public abstract E findById(K id);

  public abstract K create(E entity);

  public abstract boolean update(E entity);

  public abstract boolean delete(K id);

  public abstract boolean delete(E entity);

  public void close(Statement statement) {
    try {
      if (statement != null) {
        statement.close();
      }
    } catch (SQLException sqlE) {
      LOG.error("Cant close statement" + sqlE);
    }
  }
}
