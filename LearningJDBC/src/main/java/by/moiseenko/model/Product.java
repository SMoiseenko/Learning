package by.moiseenko.model;

import java.math.BigDecimal;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Product extends Entity {

  private String productName;
  private BigDecimal price;
  private Person person;

  public Product() {}

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Product)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(getProductName(), product.getProductName()) &&
        Objects.equals(getPrice(), product.getPrice()) &&
        Objects.equals(getPerson(), product.getPerson());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getProductName(), getPrice(), getPerson());
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
        + ", person='"
        + person.getFirstName()
        + ' '
        +person.getLastName()
        + '\''
        + '}';
  }
}