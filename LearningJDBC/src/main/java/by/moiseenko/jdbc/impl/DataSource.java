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
public class DataSource {

  private static final Logger LOG = LogManager.getLogger(DataSource.class.getName());
  private String propertyPath;

  public DataSource(String propertyPath) {
    this.propertyPath = propertyPath;
  }

  static {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
    } catch (Exception e) {
      LOG.error(e);
    }
  }

  public Connection getConnection() throws SQLException {
    Properties prop = new Properties();
    try (InputStream is = Files.newInputStream(Path.of(propertyPath))) {
      prop.loadFromXML(is);
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    String url = prop.getProperty("db.url");
    String user = prop.getProperty("db.user");
    String password = prop.getProperty("db.password");

    return DriverManager.getConnection(url, user, password);
  }
}
