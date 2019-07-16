package by.moiseenko.entity;

import java.io.Serializable;
import java.time.Year;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Table(name = "YEAR_OF_PUBLISHING")
public class YearOfPublish implements Serializable {

  private int id;
  private Year year;

  public YearOfPublish() {}

  @Id
  @Column(name = "id", updatable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "year")
  public Year getYear() {
    return year;
  }

  public void setYear(Year year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof YearOfPublish)) {
      return false;
    }
    YearOfPublish that = (YearOfPublish) o;
    return id == that.id && Objects.equals(year, that.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, year);
  }

  @Override
  public String toString() {
    return "YearOfPublish{" + "id=" + id + ", year=" + year + '}';
  }
}
