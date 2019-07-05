package by.moiseenko.entity;

import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Entity
@Table(name = "products")
public class Product {

  private static final Logger LOG = LogManager.getLogger(Product.class.getName());

  private long productId;
  private String productName;
  private BigDecimal productPrice;
  private Person personByPersonId;

  @Id
  @Column(name = "product_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  @Basic
  @Column(name = "product_name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  @Basic
  @Column(name = "product_price")
  public BigDecimal getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(BigDecimal productPrice) {
    this.productPrice = productPrice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return productId == product.productId &&
        Objects.equals(productName, product.productName) &&
        Objects.equals(productPrice, product.productPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, productName, productPrice);
  }

  @ManyToOne
  @JoinColumn(name = "person_id", referencedColumnName = "person_id")
  public Person getPersonByPersonId() {
    return personByPersonId;
  }

  public void setPersonByPersonId(Person personByPersonId) {
    this.personByPersonId = personByPersonId;
  }


}
