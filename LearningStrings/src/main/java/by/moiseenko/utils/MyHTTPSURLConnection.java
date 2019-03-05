package by.moiseenko.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.Certificate;

public class MyHTTPSURLConnection {
  private static final Logger LOG = LogManager.getLogger(MyHTTPSURLConnection.class);

  public void makeConnection(String https_url) {
    URL url;
    try {
      url = new URL(https_url);
      HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
     // getCertificate(connection);
      getContent(connection);
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }

  private void getCertificate(HttpsURLConnection connection) {
    if (connection != null) {
      Certificate[] certifArray;
      try {
        int respCode = connection.getResponseCode();
        String cipherSuite = connection.getCipherSuite();
        String reqMethod = connection.getRequestMethod();
        LOG.debug("Response code : " + respCode);
        LOG.debug("Request method : " + reqMethod);
        LOG.debug("Cipher suite : " + cipherSuite);

        certifArray = connection.getServerCertificates();
        for (Certificate c : certifArray) {
          LOG.debug("Cert Type : " + c.getType());
          LOG.debug("Cert Hash Code : " + c.hashCode());
          LOG.debug("Cert Public Key Algorithm : " + c.getPublicKey().getAlgorithm());
          LOG.debug("Cert Public Key Format : " + c.getPublicKey().getFormat());
        }
      } catch (IOException exp) {
        LOG.error(exp);
      }
    }
  }

  private void getContent(HttpsURLConnection connection) {
    try {
      connection.setRequestMethod("GET");
      connection.setRequestProperty("Mozilla/5.0", "User_Agent");
      StringBuilder sb = new StringBuilder();
      BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String bufLine;
      while ((bufLine = br.readLine()) != null) {
        sb.append(bufLine).append("\n");
      }
      LOG.debug(sb);
      if (br != null) br.close();

    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }
}
