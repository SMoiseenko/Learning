package by.moiseenko.util;

import by.moiseenko.entity.Transport;

public interface Drivable<T extends Transport> {

  int TWO = 2;
  int TEN = 10;

  static void doAction() {
    System.out.println("static interface method ;)");
  }

  void driveFront(T transport);

  void stop(T transport);

  void turnLeft(T transport);

  void turnRight(T transport);

  void driveBack(T transport);

  private int mult() {
    return TEN * TWO;
  }
}
