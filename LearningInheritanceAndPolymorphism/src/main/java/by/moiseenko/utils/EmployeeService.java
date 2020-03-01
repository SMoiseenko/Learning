package by.moiseenko.utils;

import by.moiseenko.entity.Employee;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class EmployeeService {

  private static final Logger LOG = LogManager.getLogger(EmployeeService.class.getName());


  public double getTotalSalary(List<Employee> allEmployees){
    return allEmployees.stream().mapToDouble(Employee::getSalary).sum();
  }

}
