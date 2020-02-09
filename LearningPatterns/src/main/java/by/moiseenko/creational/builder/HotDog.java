package by.moiseenko.creational.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class HotDog {

  private static final Logger LOG = LogManager.getLogger(HotDog.class.getName());

  private String nameOfProduct;
  private String frozenOrFresh;
  private String howCut;
  private String typeOfThermalPrepare;
  private String taste;


  public void setNameOfProduct(String nameOfProduct) {
    this.nameOfProduct = nameOfProduct;
  }

  public void setFrozenOrFresh(String frozenOrFresh) {
    this.frozenOrFresh = frozenOrFresh;
  }

  public void setHowCut(String howCut) {
    this.howCut = howCut;
  }

  public void setTypeOfThermalPrepare(String typeOfThermalPrepare) {
    this.typeOfThermalPrepare = typeOfThermalPrepare;
  }

  public void setTaste(String taste) {
    this.taste = taste;
  }

  @Override
  public String toString() {
    return "HotDog{" +
        "nameOfProduct='" + nameOfProduct + '\'' +
        ", frozenOrFresh='" + frozenOrFresh + '\'' +
        ", howCut='" + howCut + '\'' +
        ", typeOfThermalPrepare='" + typeOfThermalPrepare + '\'' +
        ", taste='" + taste + '\'' +
        '}';
  }
}
