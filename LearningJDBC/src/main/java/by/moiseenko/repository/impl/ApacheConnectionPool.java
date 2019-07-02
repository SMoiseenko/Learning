package by.moiseenko.repository.impl;

import by.moiseenko.repository.PersonDao;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ApacheConnectionPool {
  private static final Logger LOG = LogManager.getLogger(ApacheConnectionPool.class.getName());
  public static final String MYSQL_PROP =
      System.getProperty("user.home")
          + "/IdeaProjects/Learning/LearningJDBC/src/main/resources/jdbc_prop.xml";
  private static BasicDataSource ds = new BasicDataSource();

  static {
    Properties properties = new Properties();
    try (InputStream is = new FileInputStream(MYSQL_PROP)) {
      properties.loadFromXML(is);
    } catch (IOException ioE) {
      LOG.error("Property not found. " + ioE);
    }
    ds.setUrl(properties.getProperty("db.url"));
    ds.setUsername(properties.getProperty("db.user"));
    ds.setPassword(properties.getProperty("db.password"));
    ds.setMinIdle(Integer.parseInt(properties.getProperty("db.minIdle")));
    ds.setMaxIdle(Integer.parseInt(properties.getProperty("db.maxIdle")));
    ds.setMaxTotal(Integer.parseInt(properties.getProperty("db.maxTotal")));
  }

  private ApacheConnectionPool() {}

  public static Connection getConnection() throws SQLException {
    return ds.getConnection();
  }

}
