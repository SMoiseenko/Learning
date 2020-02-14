package by.moiseenko;

import by.moiseenko.structural.facade.PizzaOrdering;
import by.moiseenko.structural.facade.RealPizzaOrdering;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestFacade {

  private static final Logger LOG = LogManager.getLogger(TestFacade.class.getName());
  private PizzaOrdering pizzaOrdering = new RealPizzaOrdering();

  @Test
  void testFacade(){
    pizzaOrdering.orderPizza();
    assertEquals(1,1);
  }

}
