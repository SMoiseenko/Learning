package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Dumb {

  private static final Logger LOG = LogManager.getLogger(Dumb.class.getName());

  public Integer id = 3;

  public Dumb() {
    System.out.println("конструктор класса Dumb ");
    System.out.println(" id=" + id);
    // вызов потенциально полиморфного метода - плохо
    id = this.getId();
    System.out.println(" id=" + id);
  }

  public Integer getId() { // 1
    System.out.println("getId() класса Dumb ");
    return id;
  }
}
