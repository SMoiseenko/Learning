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
public class TheMan implements Name, Person, Comparable<TheMan> {

  private static final Logger LOG = LogManager.getLogger(TheMan.class.getName());
  private String name;

  public TheMan(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(TheMan o) {
    return this.name.compareTo(o.name);
  }

  @Override
  public String getName() {
    return Person.super.getName();
  }

  @Override
  public String toString() {
    return "TheMan{" +
        "name='" + name + '\'' +
        '}';
  }
}
