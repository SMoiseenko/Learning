package by.moiseenko.utils;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface RunGeoTagAnalyzer {

  long getRunningTime ();

  double getDistance();

  double getAverageSpeed();

}
