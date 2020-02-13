package by.moiseenko.structural.composite;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Worker implements SayYourName {

  private static final Logger LOG = LogManager.getLogger(Worker.class.getName());
  private String name;
  private BigDecimal salary;

  public Worker(String name, String salary) {
    this.name = name;
    this.salary = new BigDecimal(salary);
  }

  @Override
  public void SayName() {
LOG.debug("Name: " + name + "; Salary: " + salary.toString() + ';');
  }

  @Override
  public BigDecimal getSalary() {
    return salary;
  }
}
