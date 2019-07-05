package by.moiseenko.repository;

import by.moiseenko.entity.Person;
import java.util.List;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface PersonDAO {

  Person create(Person person);

  Person find(long id);

  void update(Person person);

  void delete(long id);

  List<Person> getAll();
}
