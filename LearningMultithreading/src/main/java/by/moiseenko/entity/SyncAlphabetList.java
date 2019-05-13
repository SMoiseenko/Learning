package by.moiseenko.entity;

import static by.moiseenko.service.ConcurrentUtils.sleep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SyncAlphabetList {
  private static final Logger LOG = LogManager.getLogger(SyncAlphabetList.class.getName());

  private List<Character> alphabetList;
  private ReentrantReadWriteLock lock;

  public SyncAlphabetList() {
    alphabetList = new ArrayList<>();
    lock = new ReentrantReadWriteLock();
  }

  public void addChar(Character c) {
    lock.writeLock().lock();
    try {
      LOG.debug("trying add: " + c);
      alphabetList.add(c);
      TimeUnit.MILLISECONDS.sleep(100);

    } catch (InterruptedException ie) {
      LOG.error(ie);
    } finally {
      lock.writeLock().unlock();
    }
//    sleep(1);
  }

  @Override
  public String toString() {
    lock.readLock().lock();
    StringBuilder sb;
    try {
      sb = new StringBuilder();
      sb.append("\n");
      int count = 1;
      for (Character c : alphabetList) {
        sb.append(count++).append(" - \"").append(c).append("\"\n");
      }
    } finally {
      lock.readLock().unlock();
    }
   return sb.toString();
  }
}
