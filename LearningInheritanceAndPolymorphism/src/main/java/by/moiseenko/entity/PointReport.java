package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PointReport {

  private static final Logger LOG = LogManager.getLogger(PointReport.class.getName());
  public void printReport(Point1D p) {
    System.out.printf("length=%.2f %s%n", p.length(), p);
// вызовы out.print(p.toString()) и out.print(p) для объекта идентичны !
  }

}
