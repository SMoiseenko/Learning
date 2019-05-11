package by.moiseenko.service;

import by.moiseenko.entity.CatLink;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CatPictureDownloader {
  // task -> get string from api
  //     -> string (json) to CatLink
  //     -> from Catlink.getFile -> to HDD
  //     -> LOG all downloaded files
  private static final Logger LOG = LogManager.getLogger(CatPictureDownloader.class.getName());
  private static final String URL = "https://aws.random.cat/meow";

  public static void downloadSomeCatsTo(int qty, String folderName) {
    File dir2Save = new File(System.getProperty("user.home") + File.separator + folderName);

    if (dir2Save.exists()) {
      deleteDirectory (dir2Save);
    }
    dir2Save.mkdir();

    ExecutorService executorService = Executors.newFixedThreadPool(5);
    for (int i = 0; i < qty; i++) {
      executorService.submit(createTask(dir2Save));
    }
    executorService.shutdown();
  }

  private static String getFromURL(String url) {
    StringBuilder sb = new StringBuilder();
    try {
      HttpsURLConnection httpsURLConnection = (HttpsURLConnection) (new URL(url)).openConnection();
      httpsURLConnection.setRequestMethod("GET");
      BufferedReader br =
          new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
      String line;
      while ((line = br.readLine()) != null) {
        sb.append(line);
      }
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    return sb.toString();
  }

  private static CatLink getCatLink(String json) {
    CatLink catLink = null;
    ObjectMapper om = new ObjectMapper();
    try {
      catLink = om.readValue(json, CatLink.class);
    } catch (IOException e) {
      LOG.error(e);
    }

    return catLink;
  }

  private static void downloadToHDD(String fromURL, File dir2Save) {

    try {
      URL url = new URL(fromURL);
      HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
      httpsURLConnection.setRequestMethod("GET");

      String fileName = fromURL.substring(fromURL.lastIndexOf('/') + 1, fromURL.length());
      String absolutlePath = dir2Save.getAbsolutePath() + File.separator + fileName;
      InputStream is = httpsURLConnection.getInputStream();
      OutputStream os =
          new FileOutputStream(absolutlePath);

      final int BUFFER_SIZE = 1024;
      int wasRead = 0;
      byte[] tempByte = new byte[BUFFER_SIZE];
      while ((wasRead = is.read(tempByte)) != -1) {
        os.write(tempByte, 0, wasRead);
      }
      LOG.debug(absolutlePath + " - was saved completely");

    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }

  private static Runnable createTask(File dir2Save) {
    return () -> {
      String jsonFromAPI = getFromURL(URL);
      CatLink catLink = getCatLink(jsonFromAPI);
      downloadToHDD(catLink.getFile(), dir2Save);
    };
  }
  private static void deleteDirectory (File file) {
    if (file.isDirectory()) {
      File[] entries = file.listFiles();
      if (entries != null) {
        for (File entry : entries) {
          deleteDirectory(entry);
        }
      }
    }
    if (!file.delete()) {
      LOG.error("Failed to delete " + file);
    }
  }
}
