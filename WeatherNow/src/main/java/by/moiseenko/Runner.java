package by.moiseenko;

import by.moiseenko.utils.NetworkUtils;

import java.io.File;

public class Runner {
  public static void main(String[] args) {
    NetworkUtils networkUtils = new NetworkUtils();
    File weatherJsonDir = new File("./resources/weather-forecast.json");
    if (!weatherJsonDir.exists()) {
      networkUtils.getContent(networkUtils.createConnection(networkUtils.buildURL()));
      System.out.println("weather was uploaded completely");
    } else {
      System.out.println("weather-forecast.json EXIST");
    }
  }
}
