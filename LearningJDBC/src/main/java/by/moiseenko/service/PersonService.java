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

  Person loginInSystem(String login, String password);

  int updatePerson(Person person);

  void deletePerson(long id);
}
