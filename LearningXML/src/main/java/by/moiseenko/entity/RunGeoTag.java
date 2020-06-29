package by.moiseenko.entity;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
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
    this.time = (time == null || time.isEmpty())?LocalDateTime.ofEpochSecond(0,0, ZoneOffset.UTC):LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME);

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
    return Double.compare(runGeoTag.getLat(), getLat()) == 0 &&
        Double.compare(runGeoTag.getLon(), getLon()) == 0 &&
        gethR() == runGeoTag.gethR() &&
        Double.compare(runGeoTag.getEle(), getEle()) == 0 &&
        getTime().equals(runGeoTag.getTime());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getLat(), getLon(), gethR(), getEle(), getTime());
  }

  @Override
  public String toString() {
    return "RunGeoTag{" +
        "time:" + time.format(DateTimeFormatter.ISO_DATE_TIME) +
        ", lat:" + lat +
        ", lon:" + lon +
        ", hR:" + hR +
        ", ele:" + ele +
        '}';
  }
}
