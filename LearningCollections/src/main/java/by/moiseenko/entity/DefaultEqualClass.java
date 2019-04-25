package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class DefaultEqualClass {

  private static final Logger LOG = LogManager.getLogger(DefaultEqualClass.class.getName());

  private Integer id;
  private String name;

  public DefaultEqualClass(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "DefaultEqualClass{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
