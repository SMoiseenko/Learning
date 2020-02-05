package by.moiseenko.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CookDirector {

  private static final Logger LOG = LogManager.getLogger(CookDirector.class.getName());


  public HotDog makeHotDog(HotDogCook cook) {
    cook.init();
    cook.orderProduct();
    cook.deIceProduct();
    cook.cutProduct();
    cook.prepareProduct();
    cook.tasteProduct();
    return cook.getHootDog();
  }

  public Salad makeOneFiveSalad(SaladCook cook) {
    cook.init();
    cook.orderProduct();
    cook.tasteProduct();
    return cook.getSalad();
  }

  public Salad fullStageSalad(SaladCook cook) {

    cook.init();
    cook.orderProduct();
    cook.deIceProduct();
    cook.cutProduct();
    cook.prepareProduct();
    cook.tasteProduct();
    return cook.getSalad();
  }
}
