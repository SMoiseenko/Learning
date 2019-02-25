package by.moiseenko.util.impl;

import by.moiseenko.annotation.ClassAnnotation;
import by.moiseenko.annotation.MinTransportProducerLength;
import by.moiseenko.entity.Bike;
import by.moiseenko.entity.Car;
import by.moiseenko.entity.Transport;
import by.moiseenko.util.TransportCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Constructor;

public class TransportCreatorImpl implements TransportCreator {
  private static final Logger logger = LogManager.getLogger(TransportCreatorImpl.class);

  @Override
  public Transport create(String producer, String model) {
    Transport bike = new Bike(producer, model);
    producerValidator(bike);
    classAnnotaionPresent(bike);
    logger.debug(bike);
    return bike;
  }

  @Override
  public Transport create(String producer, String model, int doorsQty) {
    Transport car = new Car(producer, model, doorsQty);
    producerValidator(car);
    classAnnotaionPresent(car);
    logger.debug(car);
    return car;
  }

  private void producerValidator(@NotNull Transport transport) {
    int minValue = 0;
    StringBuilder str = new StringBuilder();

    Class tranClass = transport.getClass();
    Constructor[] myConstr = tranClass.getDeclaredConstructors();

    for (Constructor con : myConstr) {
      if (con.isAnnotationPresent(MinTransportProducerLength.class)) {
        MinTransportProducerLength anno =
            (MinTransportProducerLength) con.getAnnotation(MinTransportProducerLength.class);
        minValue = anno.min();
        str.append(transport.getProducer());
        while (str.length() < minValue) {
          str.append('*');
        }
        String rightProducer = str.toString();
        transport.setProducer(rightProducer);
      }
    }
  }

  private void classAnnotaionPresent(@NotNull Transport transport) {
    Class claas = transport.getClass();

    if (claas.isAnnotationPresent(ClassAnnotation.class)) {
      System.out.println("ClassAnnotation.class present");
    } else {
      System.out.println("ClassAnnotation.class NOT present");
    }
  }
}
