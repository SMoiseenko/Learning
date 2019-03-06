package by.moiseenko.utils;

import org.apache.http.client.utils.URIBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.*;

public class NetworkUtils {
  private static final Logger LOG = LogManager.getLogger(NetworkUtils.class);
  private final String WEATHER_BASE_CODE = "28800";
  private final String API_KEY = "qxgnTnXdJgTgRGGNXHCOoAxDXazDQqqs";
  private final String PARAM_API_KEY = "apikey";
  private final String assertResult =
      "http://dataservice.accuweather.com/forecasts/v1/daily/5day/28800?apikey=qxgnTnXdJgTgRGGNXHCOoAxDXazDQqqs&language=ru-Ru&details=true&metric=true";
  private final int BUFFER_SIZE = 1024;

  public URL buildURL() {

    URL url = null;
    try {
      URI uri =
          new URIBuilder()
              .setScheme("http")
              .setHost("dataservice.accuweather.com")
              .setPath("/forecasts/v1/daily/5day/" + WEATHER_BASE_CODE)
              .setParameter(PARAM_API_KEY, API_KEY)
              .setParameter("language", "ru-Ru")
              .setParameter("details", "true")
              .setParameter("metric", "true")
              .build();
      url = uri.toURL();
      //      System.out.println(uri);
      //      System.out.println(uri.toString().equals(assertResult));
    } catch (URISyntaxException | MalformedURLException e) {
      LOG.error(e);
    }
    return url;
  }

  public HttpURLConnection createConnection(URL url) {
    HttpURLConnection httpUrlConnection = null;
    try {
      httpUrlConnection = (HttpURLConnection) url.openConnection();
    } catch (IOException e) {
      LOG.error(e);
    }
    return httpUrlConnection;
  }

  public boolean getContent(HttpURLConnection httpUrlConnection) {
    if (httpUrlConnection != null) {

      try {
        BufferedInputStream bis =
            new BufferedInputStream(httpUrlConnection.getInputStream(), BUFFER_SIZE);
        File weatherJsonDir = new File("./resources");
        if (!weatherJsonDir.exists()) weatherJsonDir.mkdir();

        BufferedOutputStream bos =
            new BufferedOutputStream(new FileOutputStream("./resources/weather-forecast.json"));
        byte[] inputBuffer = new byte[BUFFER_SIZE];
        int readBytes;
        while ((readBytes = bis.read(inputBuffer)) > 0) {
          bos.write(inputBuffer, 0, readBytes);
        }
        bis.close();
        bos.close();

        return true;
      } catch (IOException e) {
        LOG.error(e);
        return false;
      }
    } else return false;
  }
}
