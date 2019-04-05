package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public abstract class Bike {

  private static final Logger LOG = LogManager.getLogger(Bike.class.getName());

  private String name;

  private Bike(String name) {
    this.name = name;
  }

  public static Bike createBike(String name){
    return new Bike(name){};
  }

  @Override
  public String toString() {
    return "Bike{" +
        "name='" + name + '\'' +
        '}';
  }
}
