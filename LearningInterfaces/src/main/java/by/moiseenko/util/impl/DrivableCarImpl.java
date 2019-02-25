package by.moiseenko.util.impl;

import by.moiseenko.entity.Car;
import by.moiseenko.util.Drivable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Formatter;

public class DrivableCarImpl implements Drivable<Car> {
  private static final Logger logger = LogManager.getLogger(DrivableCarImpl.class);

  @Override
  public void driveFront(Car transport) {
    transport.setAction("DRIVE FRONT");
    logger.debug(
        new Formatter()
            .format("Car %S %s drive front.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void stop(Car transport) {
    transport.setAction("STOP");
    logger.debug(
        new Formatter().format("Car %S %s stop.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void turnLeft(Car transport) {
    transport.setAction("TURN LEFT");
    logger.debug(
        new Formatter()
            .format("Car %S %s turn left.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void turnRight(Car transport) {
    transport.setAction("TURN RIGHT");
    logger.debug(
        new Formatter()
            .format("Car %S %s turn right.", transport.getProducer(), transport.getModel()));
  }

  @Override
  public void driveBack(Car transport) {
    transport.setAction("DRIVE BACK");
    logger.debug(
        new Formatter()
            .format("Car %S %s drive back.", transport.getProducer(), transport.getModel()));
  }
}
