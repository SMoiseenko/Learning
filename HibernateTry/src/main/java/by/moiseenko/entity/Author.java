package by.moiseenko.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
  private Set<Book> booksSet;

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

  @Enumerated(value = EnumType.STRING)
  @Column(name = "country")
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
  public Set<Book> getBooksSet() {
    return booksSet;
  }

  public void setBooksSet(Set<Book> booksSet) {
    this.booksSet = booksSet;
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
}
