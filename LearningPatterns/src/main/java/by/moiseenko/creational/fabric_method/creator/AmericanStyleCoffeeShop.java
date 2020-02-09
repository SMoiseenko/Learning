package by.moiseenko.creational.fabric_method.creator;

import by.moiseenko.creational.fabric_method.product.AmericanStyleCoffee;
import by.moiseenko.creational.fabric_method.product.Coffee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class AmericanStyleCoffeeShop extends CoffeeShop {

  private static final Logger LOG = LogManager.getLogger(AmericanStyleCoffeeShop.class.getName());


  @Override
  public Coffee createCoffee() {
    return new AmericanStyleCoffee();
  }
}
