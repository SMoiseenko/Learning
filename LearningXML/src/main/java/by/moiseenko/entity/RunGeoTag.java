package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class RunGeoTag {

  private static final Logger LOG = LogManager.getLogger(RunGeoTag.class.getName());
  private String lat;
  private String lon;

  public RunGeoTag() {
  }

  public RunGeoTag(String lat, String lon) {
    this.lat = lat;
    this.lon = lon;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }

  @Override
  public String toString() {
    return "[" + lat + ", " + lon + "]";
  }
}
