package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.math.BigDecimal;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Worker {

  private static final Logger LOG = LogManager.getLogger(Worker.class.getName());

  private long id;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("email")
  private String eMail;
  private Gender gender;
  private BigDecimal salary;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
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
    if (!(o instanceof Worker)) {
      return false;
    }
    Worker worker = (Worker) o;
    return getId() == worker.getId() &&
        getFirstName().equals(worker.getFirstName()) &&
        getLastName().equals(worker.getLastName()) &&
        geteMail().equals(worker.geteMail()) &&
        getGender() == worker.getGender() &&
        getSalary().equals(worker.getSalary());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getId(), getFirstName(), getLastName(), geteMail(), getGender(), getSalary());
  }

  @Override
  public String toString() {
    return "Worker{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", eMail='" + eMail + '\'' +
        ", gender=" + gender +
        ", salary=" + salary +
        '}';
  }

  /*
   [{"id":1,
   "first_name":"Peria",
   "last_name":"Cristoforetti",
   "email":"pcristoforetti0@rediff.com",
   "gender":"Female",
   "salary":484.99},
   * */


}
