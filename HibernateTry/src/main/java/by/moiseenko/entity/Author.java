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
    @NamedQuery(name = "select_first", query = "SELECT name from Author")})
public class Author {
  private static final Logger LOG = LogManager.getLogger(Author.class.getName());
  private int id;
  private String name;
  private Set<Book> booksSet;

  public Author() {}

  @Id
  @Column(name = "author_id")
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

  public Set<Book> getBooksSet() {
    return booksSet;
  }

  public void setBooksSet(Set<Book> booksSet) {
    this.booksSet = booksSet;
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
        && Objects.equals(booksSet, author.booksSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, booksSet);
  }

  @Override
  public String toString() {
    return "Author{" + "id=" + id + ", name='" + name + '\'' + ", booksSet=" + booksSet + '}';
  }
}
