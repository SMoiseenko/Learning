package by.moiseenko.utils.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class RandomDataGenerator {
  private static final Logger LOG = LogManager.getLogger(RandomDataGenerator.class.getName());

  public static long generateLongInRange(long min, long max){
        return min+(long)(Math.random()*(max-min+1));
  }

  public static BigDecimal generateBigDecimalInRangeWithScale(double min, double max, int scale){
    double value = min+(Math.random()*(max-min+1));
    return BigDecimal.valueOf(value).setScale(scale, RoundingMode.HALF_EVEN);
  }

}
