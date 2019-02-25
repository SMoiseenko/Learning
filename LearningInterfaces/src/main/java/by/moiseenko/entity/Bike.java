package by.moiseenko.entity;

import by.moiseenko.annotation.MinTransportProducerLength;

public class Bike extends Transport {

  private static final int WEELS_QTY = 3;

  @MinTransportProducerLength(min = 3)
  public Bike(String producer, String model) {
    super(producer, model);
  }

  public static int getWeelsQty() {
    return WEELS_QTY;
  }
}
