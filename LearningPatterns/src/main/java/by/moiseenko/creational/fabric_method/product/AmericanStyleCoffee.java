package by.moiseenko.creational.fabric_method.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class AmericanStyleCoffee implements Coffee {

  private static final Logger LOG = LogManager.getLogger(AmericanStyleCoffee.class.getName());


  @Override
  public void makeAmericana() {
    LOG.debug("American style americana was made");

  }

  @Override
  public void makeCappuccino() {
    LOG.debug("American style cappuccino was made");
  }

  @Override
  public void makeEspresso() {
    LOG.debug("American style espresso was made");
  }
}
