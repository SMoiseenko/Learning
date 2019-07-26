package by.moiseenko.entity;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@NamedQuery(name = "selectWithPopulationsMoreThan", query = "from Country c where c.population >=:minPop")
@Entity
@Table(name = "COUNTRY_OF_BORN")
public class Country extends by.moiseenko.entity.Entity {

  private static final long serialVersionUID = -6017042695623844090L;
  private String name;
  private long population;

  public Country() {}

  @Column(name = "country", length = 30, unique = true, nullable = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "population", columnDefinition = "bigint(20) unsigned DEFAULT '0'", nullable = false)
  public long getPopulation() {
    return population;
  }

  public void setPopulation(long population) {
    this.population = population;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Country)) {
      return false;
    }
    Country country = (Country) o;
    return Objects.equals(id, country.id)
        && Objects.equals(name, country.name)
        && Objects.equals(population, country.population);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, population);
  }

  @Override
  public String toString() {
    return "Country{" + "id=" + id + "name=" + name + ", population=" + population + '}';
  }
}
