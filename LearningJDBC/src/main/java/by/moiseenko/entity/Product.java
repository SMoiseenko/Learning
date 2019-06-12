package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Product {
  private static final Logger LOG = LogManager.getLogger(Product.class.getName());

  private long id;
  private String productName;
  private int price;

  public Product(String productName, int price) {
    this.productName = productName;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{"
        + "id="
        + id
        + ", productName='"
        + productName
        + '\''
        + ", price="
        + price
        + '}';
  }
}
