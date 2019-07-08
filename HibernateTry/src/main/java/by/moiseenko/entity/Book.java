package by.moiseenko.entity;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Table(name = "BOOKS")
public class Book {
  private static final Logger LOG = LogManager.getLogger(Book.class.getName());

  private int id;
  private String name;
  private Set<Author> authorsSet;

  public Book() {}

  @Id
  @Column(name = "book_id")
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
        Objects.equals(authorsSet, book.authorsSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, authorsSet);
  }

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", authorsSet=" + authorsSet +
        '}';
  }
}
