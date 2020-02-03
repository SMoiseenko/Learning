package by.moiseenko.abstract_fabric;

import by.moiseenko.abstract_fabric.creator.Kitchener;
import by.moiseenko.abstract_fabric.creator.VeganKitchener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {
    Kitchener kitchener = new VeganKitchener();
    kitchener.getTypeOfCook().prepareFood(kitchener.getFood());
  }



}
