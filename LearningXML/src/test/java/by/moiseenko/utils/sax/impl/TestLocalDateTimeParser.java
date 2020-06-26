package by.moiseenko.utils.sax.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestLocalDateTimeParser {

  private static final Logger LOG = LogManager.getLogger(TestLocalDateTimeParser.class.getName());

  @Test
  public void test(){
    LocalDateTime dateTime = LocalDateTime.now();
    ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of("Europe/Minsk"));
    String dateTimeString = zonedDateTime.toString();
    LOG.debug(dateTimeString);
    Assertions.assertEquals(dateTime, ZonedDateTime.parse(dateTimeString, DateTimeFormatter.ISO_INSTANT).toLocalDateTime());

  }


}
