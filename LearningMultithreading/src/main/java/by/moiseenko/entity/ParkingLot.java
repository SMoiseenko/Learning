package by.moiseenko.entity;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ParkingLot {
  private static final Logger LOG = LogManager.getLogger(ParkingLot.class.getName());

  private String lotNumber;

  public ParkingLot(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public String getLotNumber() {
    return lotNumber;
  }

  public void setLotNumber(String lotNumber) {
    this.lotNumber = lotNumber;
  }

  public void using(int stayOnLot){
    try{
      TimeUnit.SECONDS.sleep((long) stayOnLot);
    } catch (InterruptedException ie){
      LOG.debug("Car was stealed, parking lot empty now ; )" +ie);
    }
  }
}
