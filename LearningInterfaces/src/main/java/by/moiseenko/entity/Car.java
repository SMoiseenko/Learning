package by.moiseenko.entity;

import by.moiseenko.annotation.ClassAnnotation;
import by.moiseenko.annotation.MinTransportProducerLength;
import org.jetbrains.annotations.Contract;

@ClassAnnotation
public class Car extends Transport {

  private int doorsQty;
  private static final int WEELS_QTY = 4;

  @MinTransportProducerLength
  public Car(String producer, String model, int doorsQty) {
    super(producer, model);
    this.doorsQty = doorsQty;
  }

  public int getDoorsQty() {
    return doorsQty;
  }

  public void setDoorsQty(int doorsQty) {
    this.doorsQty = doorsQty;
  }

  @Contract(pure = true)
  public static int getWeelsQty() {
    return WEELS_QTY;
  }
}
