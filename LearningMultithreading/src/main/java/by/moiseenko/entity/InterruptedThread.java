package by.moiseenko.entity;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class InterruptedThread extends Thread{

  private static final Logger LOG = LogManager.getLogger(InterruptedThread.class.getName());

  public InterruptedThread(String name) {
    super(name);
  }

  @Override
  public void run() {

    LocalDateTime start = LocalDateTime.now();
    while(!isInterrupted()){
      try{
        TimeUnit.SECONDS.sleep(1);
        LOG.debug(ChronoUnit.SECONDS.between(start, LocalDateTime.now()));
      } catch (InterruptedException ie){
        LOG.error(ie);
        interrupt();
      }
    }
  }
}
