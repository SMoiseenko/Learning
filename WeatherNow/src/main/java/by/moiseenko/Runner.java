package by.moiseenko;

import by.moiseenko.entity.Weather;
import by.moiseenko.utils.DataProvider;
import by.moiseenko.utils.WeatherCreator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class);

  public static void main(String[] args) throws Exception {
    DataProvider.actualDataExist();
    Weather weather = WeatherCreator.create();
    if (weather != null) System.out.println(weather);

        new ObjectMapper().writeValue(new File("./resources/weather-forecast-test.json"),
     weather);
        }
}
