package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class Scanner2PrintWriter {
  private static final Logger logger = LogManager.getLogger(Scanner2PrintWriter.class);

  public Scanner2PrintWriter() {}

  public void fromTheConsoleToTheFile(File file) {
    try (PrintWriter fos =
            new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, true), 1024));
        Scanner cis = new Scanner(System.in)) {
//      cis.useDelimiter("");
      String readFromConsole;
      while (cis.hasNext()) {
        readFromConsole = cis.nextLine();
        System.out.println(readFromConsole);

        fos.append(String.format("%S%n", readFromConsole));
        fos.flush();
      }
      System.out.println("EOF was found!");

    } catch (IOException e) {
      logger.error(e);
    }
  }
}
