package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
  @JsonProperty("Date")
  private String date;

  @JsonProperty("EpochDate")
  private long epochDate;

  @JsonProperty("Temperature")
  @JsonSerialize(as = HashMap.class)
  private Map<String, Temperature> temperature;

  @JsonProperty("RealFeelTemperature")
  @JsonSerialize(as = HashMap.class)
  private Map<String, Temperature> realFeelTemperature;

  @JsonProperty("RealFeelTemperatureShade")
  @JsonSerialize(as = HashMap.class)
  private Map<String, Temperature> realFeelTemperatureShade;

  public Forecast() {}

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public long getEpochDate() {
    return epochDate;
  }

  public void setEpochDate(long epochDate) {
    this.epochDate = epochDate;
  }

  public Map<String, Temperature> getTemperature() {
    return temperature;
  }

  public void setTemperature(Map<String, Temperature> temperature) {
    this.temperature = temperature;
  }

  public Map<String, Temperature> getRealFeelTemperature() {
    return realFeelTemperature;
  }

  public void setRealFeelTemperature(Map<String, Temperature> realFeelTemperature) {
    this.realFeelTemperature = realFeelTemperature;
  }

  public Map<String, Temperature> getRealFeelTemperatureShade() {
    return realFeelTemperatureShade;
  }

  public void setRealFeelTemperatureShade(Map<String, Temperature> realFeelTemperatureShade) {
    this.realFeelTemperatureShade = realFeelTemperatureShade;
  }

  @Override
  public String toString() {
    return "Forecast{"
        + "date='"
        + date
        + '\''
        + ", epochDate="
        + epochDate
        + ", temperature="
        + temperature
        + ", realFeelTemperature="
        + realFeelTemperature
        + ", realFeelTemperatureShade="
        + realFeelTemperatureShade
        + '}';
  }
}
