package by.moiseenko;

import by.moiseenko.structural.adapter.FuelCar;
import by.moiseenko.structural.adapter.SunFuelBattery;
import by.moiseenko.structural.adapter.SunToBurnedFuelAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestAdapter {

  private static final Logger LOG = LogManager.getLogger(TestAdapter.class.getName());

  @Test
  void testAdapter() {
    FuelCar car = new FuelCar();
    SunFuelBattery sunFuelBattery = new SunFuelBattery();
    SunToBurnedFuelAdapter adapter = new SunToBurnedFuelAdapter(sunFuelBattery);
    car.drive(adapter);

    Assertions.assertEquals(1, 1);
  }

}
