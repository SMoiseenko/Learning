package by.moiseenko.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.TimerTask;

public class GetWeatherScheduledTask extends TimerTask {
  private static final Logger LOG = LogManager.getLogger(GetWeatherScheduledTask.class);
  private StringBuilder httpResponceResult = null;
  private URLConnection uc;


    @Override
  public void run() {
    try {
      uc = new URL("https://www.gismeteo.by/weather-grodno-4243/now/").openConnection();
      BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
      String inputLine;
      while ((inputLine = br.readLine()) != null) {
        httpResponceResult.append(inputLine);
      }
      LOG.debug(httpResponceResult.toString());
      if (br != null) br.close();
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }
}
