package by.moiseenko.structural.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CookingIngredients {

  private static final Logger LOG = LogManager.getLogger(CookingIngredients.class.getName());

public void cooking(){
  LOG.debug("Ingredients was cooked;");
}
}
