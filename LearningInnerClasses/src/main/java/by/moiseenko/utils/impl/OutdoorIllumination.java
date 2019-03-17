package by.moiseenko.utils.impl;

import by.moiseenko.utils.Sunny;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OutdoorIllumination implements Sunny {
  private static final Logger LOG = LogManager.getLogger(OutdoorIllumination.class.getName());

  @Override
  public boolean isThereTheSunNow() {
    int hourNow;
    Date date = new Date();
    DateFormat simpleDateFormat = new SimpleDateFormat("HH");
    hourNow = Integer.parseInt(simpleDateFormat.format(date));
    LOG.debug("Now: " + hourNow);
    return hourNow >= 8 && hourNow <= 19;
  }
}
