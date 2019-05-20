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
    int[] mass = byteToInt(readFile());
    for (int a = 32; a > 31; a--) {
      for (int i : mass) {
      if (i != 0xc3){
        System.out.printf("%02x ", i);}
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

  private int[] byteToInt(byte[] array) {
    int[] result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      result[i] = (array[i] < 0) ? 256 + array[i] : array[i];
    }
    return result;
  }
}
