package by.moiseenko.service;

import by.moiseenko.entity.Person;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface PersonService {
  long createPerson(Person person);

  Person retrievePerson(long id);

  long updatePerson(long id, Person person);

  void deletePerson(long id);
}
