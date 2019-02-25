package by.moiseenko.entity;

public abstract class Aclass {
  private int a;

  public Aclass(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }

  @Override
  public String toString() {
    return "Aclass{" + "a=" + a + '}';
  }
}
