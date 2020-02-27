package by.moiseenko.entity;

import by.moiseenko.utils.Measurable;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class MeasureService {
  private static final Logger LOG = LogManager.getLogger(MeasureService.class.getName());

  public static double average(Measurable[] objects){
    return Arrays.stream(objects).mapToDouble(Measurable::getMeasure).average().orElse(0.0);
  }


}
