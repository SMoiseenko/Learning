package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Item {
  private static final Logger LOG = LogManager.getLogger(Item.class.getName());

  private Integer idItem;
  private Integer number;

  public Item(Integer idItem, Integer number) {
    super();
    this.idItem = idItem;
    this.number = number;
  }

  public Integer getIdItem() {
    return idItem;
  }

  public Integer getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Item{" +
        "idItem=" + idItem +
        ", number=" + number +
        '}';
  }
}
