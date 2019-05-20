package by.moiseenko.service;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class LelyLicBinAnalyzer {
  private static final Logger LOG = LogManager.getLogger(LelyLicBinAnalyzer.class.getName());

  public void analyze() {
    byte[] mass = readFile();
    for (int a = 32; a >0 ; a--) {
      for (byte i : mass) {
        i *= -1;
        i -= (61 - a);
        System.out.printf("%c ", i);
      }
      System.out.println();
    }
  }

  private byte[] readFile() {
    byte[] result = new byte[0];
    try (FileInputStream fis = new FileInputStream("data/lic.bin")) {
      byte[] array = new byte[fis.available()];
      int r = fis.read(array);
      LOG.debug(r + " bytes was read");
      result = array;
    } catch (IOException io) {
      LOG.error(io);
    }
    return result;
  }
}
