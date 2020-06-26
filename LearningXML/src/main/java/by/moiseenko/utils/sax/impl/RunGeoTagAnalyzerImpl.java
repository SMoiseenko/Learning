package by.moiseenko.utils.sax.impl;

import by.moiseenko.entity.RunGeoTag;
import by.moiseenko.utils.sax.RunGeoTagAnalyzer;
import java.time.Duration;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class RunGeoTagAnalyzerImpl implements RunGeoTagAnalyzer {

  private static final Logger LOG = LogManager.getLogger(RunGeoTagAnalyzerImpl.class.getName());

  private List<RunGeoTag> geoTagList;

  public RunGeoTagAnalyzerImpl(List<RunGeoTag> geoTagList) {
    this.geoTagList = geoTagList;
  }

  @Override
  public long getRunningTime() {
    return Duration
        .between(geoTagList.get(0).getTime(), geoTagList.get(geoTagList.size()-1).getTime()).getSeconds();


  }

  @Override
  public double getDistance() {
    double distance = 0;
    final int earthRadius = 6371;


    return distance;
  }

  @Override
  public double getAverageSpeed() {
    return 0;
  }
}
