package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Warrior {

  private static final Logger LOG = LogManager.getLogger(Warrior.class.getName());
  private String name;
  private WarSkill warSkill;
  {
    LOG.debug("LOGIC BLOCK BEFORE CONSTRUCTOR");
  }
  static {
    LOG.debug("STATIC LOGIC BLOCK EXECUTE ONLY ONE TIME AND ALWAYS THE FIRST");
  }

  public Warrior(String name, WarSkill warSkill) {
    this.name = name;
    this.warSkill = warSkill;
  }
  {LOG.debug("LOGIC BLOCK AFTER CONSTRUCTOR");}
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WarSkill getWarSkill() {
    return warSkill;
  }

  public void setWarSkill(WarSkill warSkill) {
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
