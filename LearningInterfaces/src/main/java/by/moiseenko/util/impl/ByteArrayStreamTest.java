package by.moiseenko.util.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.ByteArrayInputStream;

public class ByteArrayStreamTest {
  private static final Logger logger = LogManager.getLogger(ByteArrayStreamTest.class);

  public ByteArrayStreamTest() {}

  public void byteToArrayInputStreamTest(String scr) {
    byte[] b1 = scr.getBytes();

    ByteArrayInputStream bais = new ByteArrayInputStream(b1);
    System.out.println(bais.available() + " -=is equal=- " + b1.length);
    int i = -1;
    while ((i = bais.read()) != -1) {
      System.out.println((char) i);
    }
  }
}
