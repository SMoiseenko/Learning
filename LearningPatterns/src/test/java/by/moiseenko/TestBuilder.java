package by.moiseenko;

import by.moiseenko.creational.builder.CookDirector;
import by.moiseenko.creational.builder.HotDog;
import by.moiseenko.creational.builder.HotDogCook;
import by.moiseenko.creational.builder.Salad;
import by.moiseenko.creational.builder.SaladCook;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestBuilder {

  private static final Logger LOG = LogManager.getLogger(TestBuilder.class.getName());

  @Test
  public void testBuilder() {
    CookDirector director = new CookDirector();
    SaladCook cook = new SaladCook();
    Salad small = director.makeOneFiveSalad(cook);
    LOG.debug(small.toString());

    Salad big = director.fullStageSalad(cook);
    LOG.debug(big.toString());

    HotDogCook hdCook = new HotDogCook();
    HotDog hotDog = director.makeHotDog(hdCook);
    LOG.debug(hotDog.toString());
    Assertions.assertEquals(1, 1);
  }


}
