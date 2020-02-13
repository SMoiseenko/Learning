package by.moiseenko.structural.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SubRecallerDecorator extends RecallerDecorator {

  private static final Logger LOG = LogManager.getLogger(SubRecallerDecorator.class.getName());

  public SubRecallerDecorator(Recaller recaller) {
    super(recaller);
  }

  @Override
  public String getName() {
    return super.getName() + " \" AND SOME ADD FROM ME\"";
  }
}
