package by.moiseenko.util.impl;

import by.moiseenko.entity.Bike;
import by.moiseenko.util.Drivable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Formatter;

public class DrivableBikeImpl implements Drivable<Bike> {
  private static final Logger logger = LogManager.getLogger(DrivableBikeImpl.class);

  @Override
  public void driveFront(Bike transport) {
    transport.setAction("DRIVE FRONT");
    logger.debug(
        new Formatter()
            .format("Bike %S %s drive front.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void stop(Bike transport) {
    transport.setAction("STOP");
    logger.debug(
        new Formatter().format("Bike %S %s stop.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void turnLeft(Bike transport) {
    transport.setAction("TURN LEFT");
    logger.debug(
        new Formatter()
            .format("Bike %S %s turn left.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void turnRight(Bike transport) {
    transport.setAction("TURN RIGHT");
    logger.debug(
        new Formatter()
            .format("Bike %S %s turn right.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void driveBack(Bike transport) {
    transport.setAction("DRIVE BACK");
    logger.debug(
        new Formatter()
            .format("Bike %S %s drive back.", transport.getProducer(), transport.getModel()));
  }
}
