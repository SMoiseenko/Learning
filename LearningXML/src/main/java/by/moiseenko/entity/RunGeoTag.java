package by.moiseenko.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class RunGeoTag {

  private static final Logger LOG = LogManager.getLogger(RunGeoTag.class.getName());
  private double lat;
  private double lon;
  private int hR;
  private double ele;
  private LocalDateTime time;

  public RunGeoTag() {
  }

  public RunGeoTag(String lat, String lon, String hR, String ele, String time) {
    this.lat = Double.parseDouble(lat);
    this.lon = Double.parseDouble(lon);
    this.hR = (hR==null||hR.isEmpty())?0:Integer.parseInt(hR);
    this.ele = (ele==null||ele.isEmpty())?0.0d:Double.parseDouble(ele);
    this.time = LocalDateTime.parse(time, DateTimeFormatter.ISO_INSTANT);

  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }

  public int gethR() {
    return hR;
  }

  public void sethR(int hR) {
    this.hR = hR;
  }

  public double getElev() {
    return ele;
  }

  public void setElev(double ele) {
    this.ele = ele;
  }

  public String getCoordinate(){
    return "[" + lat + ", " + lon + "]";
  }

  @Override
  public String toString() {
    return "RunGeoTag{" +
        "time:" + time +
        ", lat:" + lat +
        ", lon:" + lon +
        ", hR:" + hR +
        ", ele:" + ele +
        '}';
  }
}
