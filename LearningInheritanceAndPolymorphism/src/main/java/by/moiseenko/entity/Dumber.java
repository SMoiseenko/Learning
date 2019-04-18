package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Dumber extends Dumb {

  private static final Logger LOG = LogManager.getLogger(Dumber.class.getName());

  public Integer id = 10;


  public Dumber() {
    super();
    System.out.println("конструктор класса Dumber ");
    id = this.getId();
    System.out.println(" id=" + id);
  }

  @Override
 public  Integer getId() { // 2
    System.out.println("getId() класса Dumber ");
    return id;
  }

  public void printID(){
  LOG.debug(this.id);
  LOG.debug(super.id);
  }

}
