package by.moiseenko.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Entity
@Table(name ="persons")
public class Person {

  private static final Logger LOG = LogManager.getLogger(Person.class.getName());

  private long personId;
  private String personLogin;
  private String personPassword;
  private String personFirstName;
  private String personLastName;
  private Date personDateOfBirth;
  private BigDecimal personSalary;
  private List<Product> productByPersonId;

  @Id
  @Column(name = "person_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public long getPersonId() {
    return personId;
  }

  public void setPersonId(long personId) {
    this.personId = personId;
  }

  @Basic
  @Column(name = "person_login")
  public String getPersonLogin() {
    return personLogin;
  }

  public void setPersonLogin(String personLogin) {
    this.personLogin = personLogin;
  }

  @Basic
  @Column(name = "person_password")
  public String getPersonPassword() {
    return personPassword;
  }

  public void setPersonPassword(String personPassword) {
    this.personPassword = personPassword;
  }

  @Basic
  @Column(name = "person_first_name")
  public String getPersonFirstName() {
    return personFirstName;
  }

  public void setPersonFirstName(String personFirstName) {
    this.personFirstName = personFirstName;
  }

  @Basic
  @Column(name = "person_last_name")
  public String getPersonLastName() {
    return personLastName;
  }

  public void setPersonLastName(String personLastName) {
    this.personLastName = personLastName;
  }

  @Basic
  @Column(name = "person_date_of_birth")
  public Date getPersonDateOfBirth() {
    return personDateOfBirth;
  }

  public void setPersonDateOfBirth(Date personDateOfBirth) {
    this.personDateOfBirth = personDateOfBirth;
  }

  @Basic
  @Column(name = "person_salary")
  public BigDecimal getPersonSalary() {
    return personSalary;
  }

  public void setPersonSalary(BigDecimal personSalary) {
    this.personSalary = personSalary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return personId == person.personId &&
        Objects.equals(personLogin, person.personLogin) &&
        Objects.equals(personPassword, person.personPassword) &&
        Objects.equals(personFirstName, person.personFirstName) &&
        Objects.equals(personLastName, person.personLastName) &&
        Objects.equals(personDateOfBirth, person.personDateOfBirth) &&
        Objects.equals(personSalary, person.personSalary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personId, personLogin, personPassword, personFirstName, personLastName,
        personDateOfBirth, personSalary);
  }

  @OneToMany(mappedBy = "personByPersonId", cascade = CascadeType.ALL, orphanRemoval = true)
  public List<Product> getProductByPersonId() {
    return productByPersonId;
  }

  public void setProductByPersonId(List<Product> productByPersonId) {
    this.productByPersonId = productByPersonId;
  }


}
