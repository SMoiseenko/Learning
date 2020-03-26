package by.moiseenko;

import by.moiseenko.entity.Employee;
import by.moiseenko.entity.MeasureService;
import by.moiseenko.utils.Measurable;
import java.util.Arrays;
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
public class TestMeasurable {

  private static final Logger LOG = LogManager.getLogger(TestMeasurable.class.getName());

  @Test
  void testAverage() {
    Measurable[] employeeArray = {
      new Employee(13.5),
      new Employee(22.5),
      new Employee(37.7),
      new Employee(44.4),
      new Employee(58.1),
      new Employee(62.4),
      new Employee(79.0),
      new Employee(80.2),
      new Employee(94.7),
      new Employee(113.9)
    };
    Assertions.assertEquals(60.64, MeasureService.average(employeeArray));
  }

  @Test
  void testFlatMap() {
    List<String> stringList = Arrays.asList("1,3,4", "6,7,9");
    int res =
        stringList.stream()
            .flatMap(x -> Arrays.stream(x.split(",")))
            .mapToInt(Integer::parseInt)
            .sum();
    LOG.debug(res);

    stringList.stream().flatMap(x->Arrays.stream(x.split(","))).mapToInt(Integer::parseInt).average().ifPresent(LOG::debug);
  }
}
