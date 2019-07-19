package by.moiseenko.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Table(name = "BOOKS")
public class Book extends by.moiseenko.entity.Entity {

  private static final long serialVersionUID = 3781414159550984179L;
  private String name;
  private YearOfPublish yearOfPublish;
  @JsonIgnore
  private List<Author> authorsList;

  public Book() {}

  @Column(name = "book_name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @ManyToOne(optional = false, cascade = CascadeType.ALL)
  @JoinColumn(name = "year_id")
  public YearOfPublish getYearOfPublish() {
    return yearOfPublish;
  }

  public void setYearOfPublish(YearOfPublish yearOfPublish) {
    this.yearOfPublish = yearOfPublish;
  }

  @ManyToMany(mappedBy = "booksList")
  public List<Author> getAuthorsList() {
    return authorsList;
  }

  public void setAuthorsList(List<Author> authorsList) {
    this.authorsList = authorsList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book)) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(id, book.id)
        && Objects.equals(name, book.name)
        && Objects.equals(yearOfPublish, book.yearOfPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, yearOfPublish);
  }

  @Override
  public String toString() {
    return "Book{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", yearOfPublish="
        + yearOfPublish
        + '}';
  }
}
