package by.moiseenko;

import by.moiseenko.creational.fabric_method.creator.AmericanStyleCoffeeShop;
import by.moiseenko.creational.fabric_method.creator.CoffeeShop;
import by.moiseenko.creational.fabric_method.product.CoffeeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestFabricMethod {

  @Test
  void testFabricMethod() {

    CoffeeShop americanStyleCS = new AmericanStyleCoffeeShop();
    americanStyleCS.sellCoffee(CoffeeType.ESPRESSO);//
    Assertions.assertEquals(1, 1);
  }


}
