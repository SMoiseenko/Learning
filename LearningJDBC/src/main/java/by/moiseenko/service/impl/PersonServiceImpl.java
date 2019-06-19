package by.moiseenko.service.impl;

import by.moiseenko.entity.Person;
import by.moiseenko.jdbc.PersonDao;
import by.moiseenko.service.PersonService;
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
  public long createPerson(Person person) {
    return personDao.savePerson(person);
  }

  @Override
  public Person retrievePerson(long id) {
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
