package by.moiseenko.creational.abstract_fabric.product;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PotatoFood implements Food {

  private static final Logger LOG = LogManager.getLogger(PotatoFood.class.getName());


  @Override
  public String getName() {
    return "potato";
  }

  @Override
  public String getWeight() {
    return "1 kg";
  }
}
