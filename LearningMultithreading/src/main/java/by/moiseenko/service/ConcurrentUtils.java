package by.moiseenko.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ConcurrentUtils {

  private static final Logger LOG = LogManager.getLogger(ConcurrentUtils.class.getName());

  public static void stop(ExecutorService executorService) {
    try {
      executorService.shutdown();
      executorService.awaitTermination(100, TimeUnit.SECONDS);
    } catch (InterruptedException ie) {
      LOG.error("awaitTermination interrupt");
    } finally {
      if (!executorService.isTerminated()) {
        LOG.error("Terminate non-killing tasks");
        executorService.shutdownNow();
      }
    }
  }

  public static void sleep(int secons) {
    try {
      TimeUnit.SECONDS.sleep(secons);
    } catch (InterruptedException e) {
      LOG.error("Sleep interrupted");
    }
  }
}
