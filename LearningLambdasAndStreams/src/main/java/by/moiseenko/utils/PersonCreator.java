package by.moiseenko.utils;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.Sex;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface PersonCreator {
Person create(String name, int age, Sex sex);
}
