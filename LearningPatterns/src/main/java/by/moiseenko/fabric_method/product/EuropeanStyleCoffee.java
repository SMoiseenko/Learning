package by.moiseenko.fabric_method.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class EuropeanStyleCoffee implements Coffee {

  private static final Logger LOG = LogManager.getLogger(EuropeanStyleCoffee.class.getName());

  @Override
  public void makeAmericana() {
    LOG.debug("European style americana was made");
  }

  @Override
  public void makeCappuccino() {
    LOG.debug("European style cappuccino was made");
  }

  @Override
  public void makeEspresso() {
    LOG.debug("European style espresso was made");
  }
}
