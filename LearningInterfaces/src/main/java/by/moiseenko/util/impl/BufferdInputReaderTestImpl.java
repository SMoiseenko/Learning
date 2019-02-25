package by.moiseenko.util.impl;

import by.moiseenko.util.BufferdInputReaderTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class BufferdInputReaderTestImpl implements BufferdInputReaderTest {

  @Override
  public boolean readFromFile(String filePath, int bufferSize) {
    StringBuilder stringBuilder = new StringBuilder();
    try (Reader reader = new BufferedReader(new FileReader(filePath))) {
      char[] buf = new char[bufferSize];
      int c;
      while ((c = reader.read(buf)) > 0) {
        if (c < bufferSize) {
          buf = Arrays.copyOf(buf, c);
        }
        stringBuilder.append(buf);
      }
      System.out.println(stringBuilder);
      return true;

    } catch (IOException ex) {
      System.err.println(ex);
      return false;
    }
  }
}
