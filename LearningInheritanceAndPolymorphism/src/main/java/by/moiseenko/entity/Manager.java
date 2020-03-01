package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Manager extends Employee {

  private static final Logger LOG = LogManager.getLogger(Manager.class.getName());

private double bonus;

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public double getSalary() {
    return super.getSalary() + bonus;
  }
}
