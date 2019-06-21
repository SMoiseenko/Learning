package by.moiseenko.jdbc.impl;

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
public final class DataSource {

  private static final Logger LOG = LogManager.getLogger(DataSource.class.getName());
  private Connection connection;
  private static DataSource instance;

  private DataSource(String propertyPath) {
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
      this.connection = DriverManager.getConnection(url, user, password);
//      this.connection.setAutoCommit(false);
    } catch (SQLException sqlE) {
      LOG.error("Database Connection Creation Failed : " + sqlE);
    }
  }

  public static DataSource getInstance(String propertyPath){
    if (instance == null) {
      instance = new DataSource(propertyPath);
    } else {
      try {
        if (instance.getConnection().isClosed()){
          instance = new DataSource(propertyPath);
        }
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }
    }
    return instance;
  }

  public Connection getConnection() {
     return connection;
  }
}
