package by.moiseenko.structural.flyweight;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Tree {

  private static final Logger LOG = LogManager.getLogger(Tree.class.getName());

  private int x;
  private int y;
  private TreeType treeType;

  public Tree(int x, int y, String name, String color, String texture) {
    this.x = x;
    this.y = y;
    this.treeType = TreeFactory.getTreeType(name,color,texture);
  }

  public void placeTree(){
    LOG.debug(this.toString());
  }

  @Override
  public String toString() {
    return "Tree{" +
        "x=" + x +
        ", y=" + y +
        ", treeType=" + treeType.toString() +
        '}';
  }
}
