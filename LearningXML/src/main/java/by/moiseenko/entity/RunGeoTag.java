package by.moiseenko.entity;

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
    this.hR = (hR == null || hR.isEmpty()) ? 0 : Integer.parseInt(hR);
    this.ele = (ele == null || ele.isEmpty()) ? 0.0d : Double.parseDouble(ele);
    this.time = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME);

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

  public double getEle() {
    return ele;
  }

  public void setEle(double ele) {
    this.ele = ele;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RunGeoTag)) {
      return false;
    }

    RunGeoTag runGeoTag = (RunGeoTag) o;

    if (Double.compare(runGeoTag.getLat(), getLat()) != 0) {
      return false;
    }
    if (Double.compare(runGeoTag.getLon(), getLon()) != 0) {
      return false;
    }
    if (gethR() != runGeoTag.gethR()) {
      return false;
    }
    if (Double.compare(runGeoTag.getEle(), getEle()) != 0) {
      return false;
    }
    return getTime().equals(runGeoTag.getTime());
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(getLat());
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(getLon());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + gethR();
    temp = Double.doubleToLongBits(getEle());
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + getTime().hashCode();
    return result;
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
