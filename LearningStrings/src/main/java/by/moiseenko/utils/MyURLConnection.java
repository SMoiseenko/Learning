package by.moiseenko.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class MyURLConnection {
  private static final Logger LOG = LogManager.getLogger(MyURLConnection.class);

  public void makeConnectionTo(String urlAddress) {
    URLConnection uc;
    try {
      uc = new URL(urlAddress).openConnection();
      long conLength = uc.getContentLengthLong();
      String conType = uc.getContentType();
      Date date = new Date(uc.getDate());
      StringBuilder httpResponceResult = new StringBuilder();

      LOG.debug("Content lenght = " + conLength);
      LOG.debug("Content type : " + conType);
      LOG.debug("date from url : " + date);

      BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
      String inputLine;
      while ((inputLine = br.readLine()) != null) {
        httpResponceResult.append(inputLine).append("\n");
      }
      LOG.debug(httpResponceResult.toString());
      if (br != null) br.close();
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }
}
