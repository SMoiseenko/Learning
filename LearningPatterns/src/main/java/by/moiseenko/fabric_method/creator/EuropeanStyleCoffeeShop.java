package by.moiseenko.fabric_method.creator;

import by.moiseenko.fabric_method.product.Coffee;
import by.moiseenko.fabric_method.product.EuropeanStyleCoffee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class EuropeanStyleCoffeeShop extends CoffeeShop {

  private static final Logger LOG = LogManager.getLogger(EuropeanStyleCoffeeShop.class.getName());


  @Override
  public Coffee createCoffee() {
    return new EuropeanStyleCoffee();
  }
}
