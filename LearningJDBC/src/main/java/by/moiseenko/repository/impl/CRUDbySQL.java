package by.moiseenko.repository.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CRUDbySQL {
  private static final Logger LOG = LogManager.getLogger(CRUDbySQL.class.getName());
  private ConnectorDB connectorDB;

  public CRUDbySQL(ConnectorDB connectorDB) {
    this.connectorDB = connectorDB;
  }

  public void executeUpdate(String sqlQuery) throws SQLException {
    if (connectorDB != null) {
      try (Connection connection = connectorDB.getConnection()) {
        Statement statement = connection.createStatement();
        int res = statement.executeUpdate(sqlQuery);
        LOG.debug(res + " Added/deleted/updated raws.");
      } catch (Exception e) {
        LOG.error(e);
      }
    } else throw new SQLException();
  }

  public void executeQuery(String sqlQuery) throws SQLException {
    if (connectorDB != null) {
      try (Connection connection = connectorDB.getConnection()) {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        StringBuilder sb;
        while (resultSet.next()) {
          sb = new StringBuilder();
          sb.append("Id = ")
              .append(resultSet.getString("Id"))
              .append("; ProductName = ")
              .append(resultSet.getString("ProductName"))
              .append("; Price = ")
              .append(resultSet.getString("Price"))
              .append(";");
          LOG.debug(sb.toString());
        }

      } catch (Exception e) {
        LOG.error(e);
      }
    } else throw new SQLException();
  }
}
