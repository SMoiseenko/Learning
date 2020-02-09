package by.moiseenko.creational.abstract_fabric.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CookByBoiling implements Cook {

  private static final Logger LOG = LogManager.getLogger(CookByBoiling.class.getName());

  @Override
  public void prepareFood(Food food) {
    LOG.debug(food.getWeight() + " of " + food.getName() + " cooked by boiling");
  }
}
