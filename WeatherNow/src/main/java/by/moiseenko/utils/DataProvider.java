package by.moiseenko.utils;

import java.io.File;

public class DataProvider {
  public static void actualDataExist() {
    {
      File weatherJsonDir = new File("./resources/weather-forecast.json");
      if (!weatherJsonDir.exists()) {
        NetworkUtils networkUtils = new NetworkUtils();
        networkUtils.getContent(networkUtils.createConnection(networkUtils.buildURL()));
        System.out.println("weather was uploaded completely");
      } else {
        System.out.println("weather-forecast.json EXIST");
      }
    }
  }
}
