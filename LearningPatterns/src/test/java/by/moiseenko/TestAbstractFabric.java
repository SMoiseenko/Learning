package by.moiseenko;

import by.moiseenko.abstract_fabric.creator.Kitchener;
import by.moiseenko.abstract_fabric.creator.VeganKitchener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestAbstractFabric {

  @Test
  void testAbstractFabric(){
    Kitchener kitchener = new VeganKitchener();
    kitchener.getTypeOfCook().prepareFood(kitchener.getFood());
    Assertions.assertEquals(1,1);
  }

}
