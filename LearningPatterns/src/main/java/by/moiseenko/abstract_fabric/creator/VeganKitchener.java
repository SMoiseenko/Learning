package by.moiseenko.abstract_fabric.creator;

import by.moiseenko.abstract_fabric.product.Cook;
import by.moiseenko.abstract_fabric.product.CookByBoiling;
import by.moiseenko.abstract_fabric.product.Food;
import by.moiseenko.abstract_fabric.product.PotatoFood;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class VeganKitchener implements Kitchener {

  private static final Logger LOG = LogManager.getLogger(VeganKitchener.class.getName());


  @Override
  public Food getFood() {
    return new PotatoFood();
  }

  @Override
  public Cook getTypeOfCook() {
    return new CookByBoiling();
  }
}
