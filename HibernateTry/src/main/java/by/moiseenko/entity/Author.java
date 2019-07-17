package by.moiseenko.entity;

import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Author extends by.moiseenko.entity.Entity {


  private static final long serialVersionUID = 2768094500886182765L;
  private String name;
  private Country countryOfBorn;
  private List<Book> booksList;

  public Author() {}

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
    if (!super.equals(o)) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(id, author.id)
        && Objects.equals(name, author.name)
        && Objects.equals(countryOfBorn, author.countryOfBorn);
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
