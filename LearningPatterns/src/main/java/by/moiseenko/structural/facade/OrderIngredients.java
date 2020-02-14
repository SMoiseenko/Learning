package by.moiseenko.structural.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class OrderIngredients {

  private static final Logger LOG = LogManager.getLogger(OrderIngredients.class.getName());

  public void order(){
    LOG.debug("Ingredients was ordered;");
  }

}
