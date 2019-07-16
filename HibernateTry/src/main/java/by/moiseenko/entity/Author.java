package by.moiseenko.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Entity
@Table(name = "AUTHORS")
@NamedQueries({
  @NamedQuery(name = "select_all_authors", query = "from Author"),
  @NamedQuery(name = "select_first", query = "SELECT name from Author")
})
public class Author implements Serializable {

  private int id;
  private String name;
  private Country countryOfBorn;
  private List<Book> booksList;

  public Author() {}

  @Id
  @Column(name = "author_id", updatable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "author_name", length = 50, unique = true, nullable = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "country_id")
  public Country getCountryOfBorn() {
    return countryOfBorn;
  }

  public void setCountryOfBorn(Country countryOfBorn) {
    this.countryOfBorn = countryOfBorn;
  }

  @ManyToMany(
      fetch = FetchType.EAGER,
      cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  @JoinTable(
      name = "BOOKS_AUTHORS",
      joinColumns = @JoinColumn(name = "author_id"),
      inverseJoinColumns = @JoinColumn(name = "book_id"))
  public List<Book> getBooksList() {
    return booksList;
  }

  public void setBooksList(List<Book> booksSet) {
    this.booksList = booksSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Author)) {
      return false;
    }
    Author author = (Author) o;
    return id == author.id
        && Objects.equals(name, author.name)
        && countryOfBorn == author.countryOfBorn;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, countryOfBorn);
  }

  @Override
  public String toString() {
    return "Author{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", countryOfBorn="
        + countryOfBorn
        + '}';
  }
}
