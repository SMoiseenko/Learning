package by.moiseenko.structural.adapter;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class SunFuelBattery implements SunFuel {

  private static final Logger LOG = LogManager.getLogger(SunFuelBattery.class.getName());


  @Override
  public Integer collectSun() {
    return new Random().nextInt(500);
  }
}
