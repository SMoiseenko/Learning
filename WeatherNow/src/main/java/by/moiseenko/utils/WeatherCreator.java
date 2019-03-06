package by.moiseenko.utils;

import by.moiseenko.entity.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class WeatherCreator {
  private static final Logger LOG = LogManager.getLogger(WeatherCreator.class);

  public static Weather create() {
    Weather weather = null;
    ObjectMapper om = new ObjectMapper();
    try {
      URL url = new File("./resources/weather-forecast.json").toURI().toURL();
      weather = om.readValue(url, Weather.class);
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    return weather;
  }
}
