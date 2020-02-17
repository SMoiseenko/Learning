package by.moiseenko.behavioral.iterator;

import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SocialSpammer {

  private static final Logger LOG = LogManager.getLogger(SocialSpammer.class.getName());


  public void sendMessage(Iterator<Profile> iterator, String text){
    while(iterator.hasNext()){
      LOG.debug(iterator.next().toString());
    }
  }
}
