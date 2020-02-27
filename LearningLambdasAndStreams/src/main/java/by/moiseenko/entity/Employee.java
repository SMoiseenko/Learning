package by.moiseenko.entity;

import by.moiseenko.utils.Measurable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Employee implements Measurable {

  private static final Logger LOG = LogManager.getLogger(Employee.class.getName());
  private double measure;

  public Employee(double measure) {
    this.measure = measure;
  }

  @Override
  public double getMeasure() {
    return measure;
  }
}
