package by.moiseenko.entity;

import by.moiseenko.exception.ResourceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Car extends Thread {
  private static final Logger LOG = LogManager.getLogger(Car.class.getName());

  private final long CAR_CAN_WAIT = 10;
  private ParkingZone parkingZone;

  public Car(String name, ParkingZone parkingZone) {
    super(name);
    this.parkingZone = parkingZone;
  }

  @Override
  public void run() {
    ParkingLot parkingLot = null;
    LOG.debug("Car \"" + getName() + "\" come.");
    try {
      parkingLot = parkingZone.getResource(CAR_CAN_WAIT);
      LOG.debug("Car \"" + getName() + "\" parked at " + parkingLot.getLotNumber() + " lot.");
      parkingLot.using(5);

    } catch (ResourceException re) {
      LOG.error("Car \"" + getName() + "\" went to competitors parking zone ->" + re);
    }
    if (parkingLot != null) {
      parkingZone.returnResource(parkingLot);
      LOG.debug(
          "Car \""
              + getName()
              + "\" left "
              + parkingLot.getLotNumber()
              + " lot. Everything was fine.");
    }
  }
}
