package by.moiseenko.entity;

import by.moiseenko.utils.Name;
import by.moiseenko.utils.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TheMan implements Name, Person {

  private static final Logger LOG = LogManager.getLogger(TheMan.class.getName());
  private String name;

  public TheMan(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return Person.super.getName();
  }
}
