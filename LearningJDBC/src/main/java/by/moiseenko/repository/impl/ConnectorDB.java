package by.moiseenko.repository.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public final class ConnectorDB {

  private static final Logger LOG = LogManager.getLogger(ConnectorDB.class.getName());
  private final String propertyPath;
  private static ConnectorDB instance;

  private ConnectorDB(String propertyPath) {
    this.propertyPath = propertyPath;
  }

  public static ConnectorDB getInstance(String propertyPath) {
    if (instance == null) {
      instance = new ConnectorDB(propertyPath);
    }
    return instance;
  }

  public Connection getConnection() {
    Connection connection = null;
    Properties prop = new Properties();
    try (InputStream is = Files.newInputStream(Path.of(propertyPath))) {
      prop.loadFromXML(is);
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    String url = prop.getProperty("db.url");
    String user = prop.getProperty("db.user");
    String password = prop.getProperty("db.password");

    try {
      connection = DriverManager.getConnection(url, user, password);
      //      this.connection.setAutoCommit(false);
    } catch (SQLException sqlE) {
      LOG.error("Database Connection Creation Failed : " + sqlE);
    }
    return connection;
  }
}
