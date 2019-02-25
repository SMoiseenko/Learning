package by.moiseenko.entity;

public class Bclass extends Aclass {

  private int b;

  public Bclass(int a, int b) {
    super(a);
    this.b = b;
  }

  public int getB() {
    return b;
  }

  public int mult() {
    return this.getA() * b;
  }

  @Override
  public String toString() {
    return super.toString() + "Bclass{" + "b=" + b + '}';
  }
}
