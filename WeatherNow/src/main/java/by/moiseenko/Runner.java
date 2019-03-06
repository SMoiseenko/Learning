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
    //    if (weather == null) weather = new Weather();
    //    if (weather.getHeadline() == null) weather.setHeadline(new ActualData());
    //    weather.getHeadline().setEffectiveDate("2019-03-09T19:00:00+03:00");
    //    weather.getHeadline().setEffectiveEpochDate(1552147200);
    //    weather.getHeadline().setSeverity(2);
    //    weather.getHeadline().setText("Суббота, вечер - Воскресенье, день: ожидается дождливая
    // погода");
    //    weather.getHeadline().setCategory("rain");
    //    weather.getHeadline().setEndDate("2019-03-10T19:00:00+03:00");
    //    weather.getHeadline().setEndEpochDate(1552233600);
    //
    // weather.getHeadline().setMobileLink("http://m.accuweather.com/ru/by/grodno/28800/extended-weather-forecast/28800?unit=c");
    //
    // weather.getHeadline().setLink("http://www.accuweather.com/ru/by/grodno/28800/daily-weather-forecast/28800?unit=c");
    //
        new ObjectMapper().writeValue(new File("./resources/weather-forecast-test.json"),
     weather);

        double valdot = -2.1;

  }
}
