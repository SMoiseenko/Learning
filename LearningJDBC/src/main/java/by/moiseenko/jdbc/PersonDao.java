package by.moiseenko.jdbc;

import by.moiseenko.entity.Person;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface PersonDao {
void createPerson(Person person);
Person retrievePerson(long id);
void updatePerson(Person person);
void deletePerson(long id);
}
