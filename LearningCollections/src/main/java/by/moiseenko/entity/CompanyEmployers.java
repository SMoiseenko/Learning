package by.moiseenko.entity;

import by.moiseenko.utils.PersonCreator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CompanyEmployers implements Iterable<Person>{
  private static final Logger LOG = LogManager.getLogger(CompanyEmployers.class.getName());

  private int id;
  private List<Person> personsList;

  public CompanyEmployers(int id, int personsQty) {
    this.id = id;
    this.personsList = new PersonCreator().generatePersonsList(personsQty);
  }

  public int getId() {
    return id;
  }

  public List<Person> getPersonsList() {
    return Collections.unmodifiableList(personsList);
  }

  @NotNull
  @Override
  public Iterator<Person> iterator() {
    return personsList.iterator();
  }
}
