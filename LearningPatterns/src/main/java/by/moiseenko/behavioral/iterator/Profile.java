package by.moiseenko.behavioral.iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Profile {

  private static final Logger LOG = LogManager.getLogger(Profile.class.getName());
  private int id;
  private String eMail;

  public Profile(int id, String eMail) {
    this.id = id;
    this.eMail = eMail;
  }

  @Override
  public String toString() {
    return "Profile{" +
        "id=" + id +
        ", eMail='" + eMail + '\'' +
        '}';
  }
}
