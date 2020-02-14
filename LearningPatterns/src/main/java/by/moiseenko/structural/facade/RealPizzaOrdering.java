package by.moiseenko.structural.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class RealPizzaOrdering implements PizzaOrdering {

  private static final Logger LOG = LogManager.getLogger(RealPizzaOrdering.class.getName());
  private OrderIngredients orderIngredients = new OrderIngredients();
  private CookingIngredients cookingIngredients = new CookingIngredients();
  private Payment payment = new Payment();

  @Override
  public void orderPizza() {
    orderIngredients.order();
    cookingIngredients.cooking();
    payment.receivePayment();
  }
}
