package by.moiseenko.service.impl;

import by.moiseenko.model.Person;
import by.moiseenko.repository.PersonDao;
import by.moiseenko.service.PersonService;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PersonServiceImpl implements PersonService {

  private static final Logger LOG = LogManager.getLogger(PersonServiceImpl.class.getName());
  private PersonDao personDao;

  public PersonServiceImpl(PersonDao personDao) {
    this.personDao = personDao;
  }

  @Override
  public List<Person> getAllPersons() {
    return personDao.getAllPersons();
  }

  @Override
  public Person loginInSystem(String login, String password) {
    List<Person> personList = getAllPersons();
    return personList.stream()
        .filter(p -> p.getLogin().equals(login) && p.getPassword().equals(password))
        .collect(
            Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                  if (list.size() != 1) {
                    throw new IllegalArgumentException("Wrong login or password");
                  }
                  return list.get(0);
                }));
  }

  @Override
  public long createPerson(Person person) {
    return personDao.savePerson(person);
  }

  @Override
  public Person findPerson(long id) {
    return personDao.findPerson(id);
  }

  @Override
  public long updatePerson(long id, Person person) {
    return personDao.updatePerson(id, person);
  }

  @Override
  public void deletePerson(long id) {
    personDao.deletePerson(id);
  }
}
