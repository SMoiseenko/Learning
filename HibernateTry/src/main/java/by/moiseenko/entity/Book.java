package by.moiseenko.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
public class Book implements Serializable {

  private int id;
  private String name;
  private YearOfPublish yearOfPublish;
  private Set<Author> authorsSet;

  public Book() {}

  @Id
  @Column(name = "book_id", updatable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

  @ManyToMany(mappedBy = "booksSet")
  public Set<Author> getAuthorsSet() {
    return authorsSet;
  }

  public void setAuthorsSet(Set<Author> authorsSet) {
    this.authorsSet = authorsSet;
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
    return id == book.id &&
        Objects.equals(name, book.name) &&
        Objects.equals(yearOfPublish, book.yearOfPublish);
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
