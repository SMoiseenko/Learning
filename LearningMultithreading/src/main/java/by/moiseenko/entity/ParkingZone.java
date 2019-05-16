package by.moiseenko.entity;

import by.moiseenko.exception.ResourceException;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ParkingZone {
  private static final Logger LOG = LogManager.getLogger(ParkingZone.class.getName());

  private static final int POOL_SIZE = 5;
  private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
  private final Queue<ParkingLot> resources;

  public ParkingZone(Queue<ParkingLot> resources) {
    this.resources = resources;
  }

  public ParkingLot getResource(long waitingTime) throws ResourceException {
    try {
      if (semaphore.tryAcquire(waitingTime, TimeUnit.SECONDS)) {
        ParkingLot parkingLot = resources.poll();
        return parkingLot;
      }
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
    throw new ResourceException(" : , you work to slow, timeout exceeded !!!");
  }

  public void returnResource(ParkingLot parkingLot) {
    resources.add(parkingLot);
    semaphore.release();
  }
}
