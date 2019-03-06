package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Weather {
  @JsonProperty("Headline")
  private ActualData headline;

  @JsonProperty("DailyForecasts")
  private Forecast[] dailyForecasts;

  public Weather() {}

  public ActualData getHeadline() {
    return headline;
  }

  public void setHeadline(ActualData headline) {
    this.headline = headline;
  }

  public Forecast[] getDailyForecasts() {
    return dailyForecasts;
  }

  public void setDailyForecasts(Forecast[] dailyForecasts) {
    this.dailyForecasts = dailyForecasts;
  }

  @Override
  public String toString() {
    return "Weather{"
        + "headline="
        + headline
        + ", dailyForecasts="
        + Arrays.toString(dailyForecasts)
        + '}';
  }
}
