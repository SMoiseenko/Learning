package by.moiseenko.structural.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class FuelCar {

  private static final Logger LOG = LogManager.getLogger(FuelCar.class.getName());

  public void drive(BurnedFuel fuel) {
    LOG.debug("Car use " + fuel.getPowerAndDrive());
  }
}
