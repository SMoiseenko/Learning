package by.moiseenko.structural.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class SunToBurnedFuelAdapter implements BurnedFuel {

  private static final Logger LOG = LogManager.getLogger(SunToBurnedFuelAdapter.class.getName());
  private SunFuel sunFuel;

  public SunToBurnedFuelAdapter(SunFuel sunFuel) {
    this.sunFuel = sunFuel;
  }

  @Override
  public String getPowerAndDrive() {
    return sunFuel.collectSun().toString() + " OF SUN ENERGY";

  }
}
