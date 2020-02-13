package by.moiseenko.structural.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class StandardRecaller implements Recaller {

  private static final Logger LOG = LogManager.getLogger(StandardRecaller.class.getName());
  private String name;


  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
