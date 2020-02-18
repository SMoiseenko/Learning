package by.moiseenko.entity;

import java.util.Comparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TheManComparator implements Comparator<TheMan> {

  private static final Logger LOG = LogManager.getLogger(TheManComparator.class.getName());

  @Override
  public int compare(TheMan o1, TheMan o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
