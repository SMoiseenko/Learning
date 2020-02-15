package by.moiseenko.structural.flyweight;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TreeFactory {

  private static final Logger LOG = LogManager.getLogger(TreeFactory.class.getName());

  private static Map<String,TreeType> cache;

  public static TreeType getTreeType(String name, String color, String texture) {
    if (cache == null) {
      cache = new HashMap<>();
    }
    TreeType tree = cache.get(name);
    if(tree == null){
      tree = new TreeType(name, color, texture);
      cache.put(name, tree);
    }
     return tree;
  }


}
