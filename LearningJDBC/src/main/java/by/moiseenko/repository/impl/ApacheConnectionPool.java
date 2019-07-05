package by.moiseenko.repository.impl;

import by.moiseenko.repository.ConnectionPool;
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
public class ApacheConnectionPool implements ConnectionPool {
  private static final Logger LOG = LogManager.getLogger(ApacheConnectionPool.class.getName());
  private String mysqlProp;
  private BasicDataSource ds;

  public ApacheConnectionPool(String mysqlProp) {
    this.mysqlProp = System.getProperty("user.home")+mysqlProp;
    init();
  }

  public Connection getConnection() throws SQLException {
    return ds.getConnection();
  }

  private void init(){
    Properties properties = new Properties();
    try (InputStream is = new FileInputStream(mysqlProp)) {
      properties.loadFromXML(is);
    } catch (IOException ioE) {
      LOG.error("Property not found. " + ioE);
    }
    ds = new BasicDataSource();
    ds.setUrl(properties.getProperty("db.url"));
    ds.setUsername(properties.getProperty("db.user"));
    ds.setPassword(properties.getProperty("db.password"));
    ds.setMinIdle(Integer.parseInt(properties.getProperty("db.minIdle")));
    ds.setMaxIdle(Integer.parseInt(properties.getProperty("db.maxIdle")));
    ds.setMaxTotal(Integer.parseInt(properties.getProperty("db.maxTotal")));
  }
}
