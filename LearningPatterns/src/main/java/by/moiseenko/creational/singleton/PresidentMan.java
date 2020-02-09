package by.moiseenko.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class PresidentMan {

  private static final Logger LOG = LogManager.getLogger(PresidentMan.class.getName());

  private static PresidentMan instance;
  private static String name;

  private PresidentMan() {

  }

  public static PresidentMan getInstance() {

    PresidentMan result = instance;
    if (instance != null) {
      return result;
    }
    synchronized (PresidentMan.class) {
      if (instance == null) {
        instance = new PresidentMan();
        name = "Azm Esm Csar";
      }
    }
    return instance;
  }

  public void sayMyselfName() {
    LOG.debug(name);
  }

}
