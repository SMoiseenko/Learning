package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Goods {
  private static final Logger LOG = LogManager.getLogger(Goods.class.getName());

  private int registrationNumber;

  public Goods(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }
}
