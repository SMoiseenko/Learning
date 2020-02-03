package by.moiseenko.fabric_method;

import by.moiseenko.fabric_method.creator.AmericanStyleCoffeeShop;
import by.moiseenko.fabric_method.creator.CoffeeShop;
import by.moiseenko.fabric_method.product.CoffeeType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {
    CoffeeShop americanStyleCS = new AmericanStyleCoffeeShop();
    americanStyleCS.sellCoffee(CoffeeType.ESPRESSO);//
  }
}
