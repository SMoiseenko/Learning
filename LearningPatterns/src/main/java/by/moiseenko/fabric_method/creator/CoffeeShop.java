package by.moiseenko.fabric_method.creator;

import by.moiseenko.fabric_method.product.Coffee;
import by.moiseenko.fabric_method.product.CoffeeType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public abstract class CoffeeShop {

  protected static final Logger LOG = LogManager.getLogger(CoffeeShop.class.getName());

  public void sellCoffee(CoffeeType type){
    Coffee coffee = createCoffee();
    switch (type){
      case AMERICANA -> coffee.makeAmericana();
      case ESPRESSO -> coffee.makeEspresso();
      case CAPPUCCINO -> coffee.makeCappuccino();
      default -> throw new IllegalArgumentException();
    };
  }

  public abstract Coffee createCoffee();

}
