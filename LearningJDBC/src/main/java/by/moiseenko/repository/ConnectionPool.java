package by.moiseenko.repository;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface ConnectionPool {
  Connection getConnection() throws SQLException;


}
