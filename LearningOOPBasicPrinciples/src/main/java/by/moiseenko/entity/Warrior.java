package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Warrior {

  private static final Logger LOG = LogManager.getLogger(Warrior.class.getName());
  private String name;
  private WarSkill warSkill;

  static{
    LOG.debug("STATIC BLOCK EXECUTE FIRST AND ONLY ONE TIME");
  }
  {
    LOG.debug("Now we create new warrior");
  }

  public Warrior(String name, WarSkill warSkill) {
    this.name = name;
    this.warSkill = warSkill;
  }

  @Override
  public String toString() {
    return "Warrior{" +
        "name='" + name + '\'' +
        ", warSkill=" + warSkill +
        '}';
  }
}
