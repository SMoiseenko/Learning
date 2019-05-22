package by.moiseenko.entity;

import java.util.concurrent.Exchanger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Subject {
  private static final Logger LOG = LogManager.getLogger(Subject.class.getName());

  protected static Exchanger<Item> exchanger = new Exchanger<>();
  private String name;
  protected Item item;

  public Subject(String name, Item item) {
    this.name = name;
    this.item = item;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }
}
