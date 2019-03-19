package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {
    LOG.debug("!!!!!CAR = CAR!!!!!");
    Car car = new Car();
    car.publicMethod();
    car.finalMethod();
    car.protectedMethod();
    LOG.debug(car.doorsQty + " dorQty direct");
    LOG.debug(car.weelsQty + " weelsQty direct");

    LOG.debug("!!!!!CAR = MAZDA CAR!!!!!");
    Car carMazdaCar = new MazdaCar();
    carMazdaCar.publicMethod();
    carMazdaCar.finalMethod();
    carMazdaCar.protectedMethod();
    LOG.debug(carMazdaCar.doorsQty + " dorQty direct");
    LOG.debug(carMazdaCar.weelsQty + " weelsQty direct");
    LOG.debug("!!!!!MAZDA CAR = MAZDA CAR!!!!!");
    MazdaCar mazdaCar = new MazdaCar();
    mazdaCar.publicMethod();
    mazdaCar.finalMethod();
    mazdaCar.protectedMethod();
    LOG.debug(mazdaCar.doorsQty + " dorQty direct");
    LOG.debug(mazdaCar.weelsQty + " weelsQty direct");
  }
}
