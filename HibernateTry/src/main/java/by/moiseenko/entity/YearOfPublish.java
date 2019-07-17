package by.moiseenko.entity;

import java.time.Year;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Table(name = "YEAR_OF_PUBLISHING")
public class YearOfPublish extends by.moiseenko.entity.Entity {

  private static final long serialVersionUID = -3019836780165173941L;
  private Year year;

  public YearOfPublish() {}

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
    return Objects.equals(id, that.id) && Objects.equals(year, that.year);
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
