package by.moiseenko.abstract_fabric.creator;

import by.moiseenko.abstract_fabric.product.Cook;
import by.moiseenko.abstract_fabric.product.Food;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface Kitchener {

  Food getFood();
  Cook getTypeOfCook();

}
