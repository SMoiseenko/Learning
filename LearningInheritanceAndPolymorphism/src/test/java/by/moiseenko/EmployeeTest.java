package by.moiseenko;

import by.moiseenko.entity.Employee;
import by.moiseenko.entity.Manager;
import by.moiseenko.utils.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class EmployeeTest {

  private static final Logger LOG = LogManager.getLogger(EmployeeTest.class.getName());

  @Test
  void test1() {
    List<Employee> allEmployees = new ArrayList<>();
    Employee worker = new Employee();

    Employee manager = new Manager();

    allEmployees.add(worker);
    allEmployees.add(manager);

    for (Employee emp: allEmployees){
      emp.setSalary(1000.0);
      if (emp instanceof Manager){
        ((Manager) emp).setBonus(emp.getSalary()/100*10);
      }
    }

    ArrayList<String> stringList = new ArrayList<>(100){
      @Override
      public void add(int index, String element) {
        super.add(index, element);
        LOG.debug(String.format("%d - index, %s - element", index, element));
      }
    };

    Assertions.assertEquals(2100, new EmployeeService().getTotalSalary(allEmployees));
  }

}
