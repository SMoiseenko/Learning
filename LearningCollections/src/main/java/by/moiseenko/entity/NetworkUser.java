package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class NetworkUser {
  private static final Logger LOG = LogManager.getLogger(NetworkUser.class.getName());

  @JsonProperty("id")
  private long id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("gender")
  private Gender gender;

  @JsonIgnore
  private int age;

  @JsonProperty("dayOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  @JsonDeserialize(using = LocalDateDeserializer.class)
  @JsonSerialize(using = LocalDateSerializer.class)
  private LocalDate dayOfBirth;

  @JsonProperty("eMail")
  private String eMail;

  @JsonProperty("ipAddress")
  private String ipAddress;

  @JsonCreator
  public NetworkUser(
      @JsonProperty("id") long id,
      @JsonProperty("firstName") String firstName,
      @JsonProperty("lastName") String lastName,
      @JsonProperty("gender") Gender gender,
      @JsonProperty("dayOfBirth") LocalDate dayOfBirth,
      @JsonProperty("eMail") String eMail,
      @JsonProperty("ipAddress") String ipAddress) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.age = (int)(ChronoUnit.YEARS.between(dayOfBirth, LocalDate.now()));
    this.dayOfBirth = dayOfBirth;
    this.eMail = eMail;
    this.ipAddress = ipAddress;
  }

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

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public LocalDate getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(LocalDate dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public String geteMail() {
    return eMail;
  }

  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkUser that = (NetworkUser) o;
    return id == that.id
        && firstName.equals(that.firstName)
        && lastName.equals(that.lastName)
        && gender == that.gender
        && age == that.age
        && dayOfBirth.equals(that.dayOfBirth)
        && eMail.equals(that.eMail)
        && ipAddress.equals(that.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, gender, age, dayOfBirth, eMail, ipAddress);
  }

  @Override
  public String toString() {
    return String.format(
        "User{Id = %04d, First Name = %s, Last Name = %s, Gender = %s, Age = %d, Day Of Births = %s, eMail = %s, IP Address = %s}",
        id,
        firstName,
        lastName,
        gender.name().toLowerCase(),
        age,
        dayOfBirth.format(DateTimeFormatter.ofPattern("dd LLLL yyyy")),
        eMail,
        ipAddress);
  }
}
