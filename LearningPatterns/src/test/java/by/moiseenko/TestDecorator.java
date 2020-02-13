package by.moiseenko;

import by.moiseenko.structural.decorator.Recaller;
import by.moiseenko.structural.decorator.RecallerDecorator;
import by.moiseenko.structural.decorator.StandardRecaller;
import by.moiseenko.structural.decorator.SubRecallerDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestDecorator {

  private static final Logger LOG = LogManager.getLogger(TestDecorator.class.getName());


  @Test
  void testDecorator(){

    Recaller recaller = new StandardRecaller();
    recaller.setName("ORIGINAL");
    LOG.debug(recaller.getName());
    recaller = new SubRecallerDecorator(recaller);
    LOG.debug(recaller.getName());
    recaller = new RecallerDecorator(recaller);
    LOG.debug(recaller.getName());

    Assertions.assertEquals(1,1);
  }

}
