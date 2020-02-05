package by.moiseenko.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SaladCook implements Cook {

  private static final Logger LOG = LogManager.getLogger(SaladCook.class.getName());

  private Salad salad;

  @Override
  public void init() {
this.salad = new Salad();
  }

  @Override
  public void orderProduct() {
this.salad.setOne(1);
  }

  @Override
  public void deIceProduct() {
this.salad.setTwo(2);
  }

  @Override
  public void cutProduct() {
this.salad.setThree(3);
  }

  @Override
  public void prepareProduct() {
this.salad.setFour(4);
  }

  @Override
  public void tasteProduct() {
this.salad.setFifth(5);
  }

  public Salad getSalad(){
    return this.salad;
  }
}
