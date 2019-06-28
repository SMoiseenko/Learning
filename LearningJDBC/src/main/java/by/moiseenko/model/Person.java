package by.moiseenko.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Person extends Entity {
  private static final Logger LOG = LogManager.getLogger(Person.class.getName());

  private String login;
  private String password;
  private String firstName;
  private String lastName;
  private LocalDate dateOfBirth;
  private BigDecimal salary;
  private List<Product> productList;

  public Person() {}

  public void addProduct(Product product) {
    if (productList == null) {
      productList = new ArrayList<>();
    }
    product.setPerson(this);
    productList.add(product);
  }

  public List<Product> getProductList() {
    return (productList != null) ? productList : new ArrayList<>();
  }

  public void deleteProduct(Product product) {
    if (productList != null) {
      productList.remove(product);
    }
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getAge() {
    return (int) ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
  }

  public BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(BigDecimal salary) {
    this.salary = salary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Person)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Person person = (Person) o;
    return getAge() == person.getAge()
        && Objects.equals(getLogin(), person.getLogin())
        && Objects.equals(getPassword(), person.getPassword())
        && Objects.equals(getFirstName(), person.getFirstName())
        && Objects.equals(getLastName(), person.getLastName())
        && Objects.equals(getDateOfBirth(), person.getDateOfBirth())
        && Objects.equals(getSalary(), person.getSalary())
        && Objects.equals(getProductList(), person.getProductList());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        super.hashCode(),
        getLogin(),
        getPassword(),
        getFirstName(),
        getLastName(),
        getDateOfBirth(),
        getAge(),
        getSalary(),
        getProductList());
  }

  @Override
  public String toString() {
    return "Person{"
        + "id= '"
        + id
        + '\''
        + "login='"
        + login
        + '\''
        + ", password='"
        + password
        + '\''
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", dateOfBirth="
        + dateOfBirth
        + ", age="
        + this.getAge()
        + ", salary="
        + salary
        + '}';
  }
}
