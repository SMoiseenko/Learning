package by.moiseenko.structural.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class RecallerDecorator implements Recaller {

  private static final Logger LOG = LogManager.getLogger(RecallerDecorator.class.getName());

  private Recaller recaller;

  public RecallerDecorator(Recaller recaller) {
    this.recaller = recaller;
  }

  @Override
  public String getName() {
    return recaller.getName() + " \"ADDED BY DECORATOR\"";
  }

  @Override
  public void setName(String name) {
    recaller.setName(name);
  }
}
