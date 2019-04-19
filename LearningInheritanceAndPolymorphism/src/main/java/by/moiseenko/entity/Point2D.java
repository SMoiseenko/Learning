package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Point2D extends Point1D {

  private static final Logger LOG = LogManager.getLogger(Point2D.class.getName());

  private int y;
  public Point2D(int x, int y) {
    super(x);
    this.y = y;
  }
  @Override
  public double length() {
    return Math.hypot(super.length(), y);
/* просто length() нельзя, т.к. метод будет вызывать сам себя, что
приведет к бесконечной рекурсии и ошибке во время выполнения */
  }
  @Override
  public String toString() {
    return super.toString() + " y=" + y;
  }
}
