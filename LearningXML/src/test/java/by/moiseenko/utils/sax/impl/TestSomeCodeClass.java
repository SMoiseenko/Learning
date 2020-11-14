package by.moiseenko.utils.sax.impl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestSomeCodeClass {

  private static final Logger LOG = LogManager.getLogger(TestSomeCodeClass.class.getName());


  @Test
  public void printTime(){
    LOG.debug(
        LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME));
    Assertions.assertEquals(1,1);
  }


}
