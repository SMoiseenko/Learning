package by.moiseenko.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Resource {
  private static final Logger LOG = LogManager.getLogger(Resource.class.getName());

  private FileWriter fileWriter;

  public Resource(String fileName) {
    File file = new File(fileName);
    if (!file.exists()) new File(fileName.substring(0, fileName.lastIndexOf("/"))).mkdirs();

    try {
      this.fileWriter = new FileWriter(file, false);
    } catch (IOException e) {
      LOG.error(e);
    }
  }

  public boolean write(String message, int i) {
    if (fileWriter != null) {
      try {
        synchronized (fileWriter) {
          fileWriter.append(message + i);
          TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 50));
          fileWriter.append("->" + i + " ");
        }
        return true;
      } catch (IOException | InterruptedException e) {
        LOG.debug(e);
        return false;
      }

    } else return false;
  }

  public void close() {
    try {
      fileWriter.close();
    } catch (IOException e) {
      LOG.error(e);
    }
  }
}
