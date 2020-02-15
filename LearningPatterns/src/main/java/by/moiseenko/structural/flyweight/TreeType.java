package by.moiseenko.structural.flyweight;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TreeType {

  private static final Logger LOG = LogManager.getLogger(TreeType.class.getName());

  private String name;
  private String color;
  private String texture;

  public TreeType(String name, String color, String texture) {
    this.name = name;
    this.color = color;
    this.texture = texture;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public String getTexture() {
    return texture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TreeType)) {
      return false;
    }
    TreeType treeType = (TreeType) o;
    return Objects.equals(getName(), treeType.getName()) &&
        Objects.equals(getColor(), treeType.getColor()) &&
        Objects.equals(getTexture(), treeType.getTexture());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getColor(), getTexture());
  }

  @Override
  public String toString() {
    return "TreeType{" +
        "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", texture='" + texture + '\'' +
        ", hash='" + this.hashCode() +
        '}';
  }
}
