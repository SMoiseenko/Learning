package by.moiseenko.entity;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */


public class Abonent {

  private static final Logger LOG = LogManager.getLogger(Abonent.class.getName());

  private String id;
  private String firstName;
  private String lastName;
  private String email;
  private String gender;
  private String ip_address;

  public Abonent() {
  }

  public Abonent(String id, String firstName, String lastName, String email, String gender,
      String ip_address) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.ip_address = ip_address;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getIp_address() {
    return ip_address;
  }

  public void setIp_address(String ip_address) {
    this.ip_address = ip_address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Abonent)) {
      return false;
    }
    Abonent abonent = (Abonent) o;
    return id.equals(abonent.id) &&
        firstName.equals(abonent.firstName) &&
        lastName.equals(abonent.lastName) &&
        email.equals(abonent.email) &&
        gender.equals(abonent.gender) &&
        ip_address.equals(abonent.ip_address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, gender, ip_address);
  }

  @Override
  public String toString() {
    return "Abonent{" +
        "id='" + id + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +
        ", gender='" + gender + '\'' +
        ", ip_address='" + ip_address + '\'' +
        '}';
  }
}
