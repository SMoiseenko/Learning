package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Point1D {

  private static final Logger LOG = LogManager.getLogger(Point1D.class.getName());
  private int x;

  public Point1D(int x) {
    this.x = x;
  }
  public double length() {
    return Math.abs(x);
  }
  @Override
  public String toString() {
    return " x=" + x;
  }
}
