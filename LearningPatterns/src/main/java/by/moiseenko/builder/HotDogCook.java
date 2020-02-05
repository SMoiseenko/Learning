package by.moiseenko.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class HotDogCook implements Cook {

  private HotDog food;

  private static final Logger LOG = LogManager.getLogger(HotDogCook.class.getName());


  @Override
  public void init() {
    this.food = new HotDog();
  }

  @Override
  public void orderProduct() {
    this.food.setNameOfProduct("Was ordered: Bun, sausage, ketchup.");

  }

  @Override
  public void deIceProduct() {
    this.food.setFrozenOrFresh("All components was frozen.");
  }

  @Override
  public void cutProduct() {
    this.food.setHowCut("All products no need to be cut.");
  }

  @Override
  public void prepareProduct() {
    this.food.setTypeOfThermalPrepare("Put everything inside and just a little bit worm.");
  }

  @Override
  public void tasteProduct() {
    this.food.setTaste("Amazing taste.");
  }

  public HotDog getHootDog() {
    return this.food;
  }

}
