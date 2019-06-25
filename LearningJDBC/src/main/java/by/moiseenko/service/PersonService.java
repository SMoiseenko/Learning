package by.moiseenko.service;

import by.moiseenko.model.Person;
import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface PersonService {

  List<Person> getAllPersons();

  long createPerson(Person person);

  Person findPerson(long id);

  long updatePerson(long id, Person person);

  void deletePerson(long id);
}
