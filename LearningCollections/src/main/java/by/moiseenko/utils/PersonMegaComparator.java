package by.moiseenko.utils;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.PersonEnum;
import java.util.Comparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PersonMegaComparator implements Comparator<Person> {
  private PersonEnum personEnum;
  private static final Logger LOG = LogManager.getLogger(PersonMegaComparator.class.getName());

  public PersonMegaComparator(PersonEnum personEnum, boolean ascend) {
    this.personEnum = personEnum;
    this.personEnum.setAscend(ascend);
  }

  public PersonEnum getPersonEnum() {
    return personEnum;
  }

  @Override
  public int compare(Person o1, Person o2) {
    switch (personEnum) {
      case NAME_ALPHABET:
        return (personEnum.isAscend())
            ? o1.getName().compareTo(o2.getName())
            : o2.getName().compareTo(o1.getName());
      case NAME_LENGTH:
        return (personEnum.isAscend())
            ? o1.getName().length() - o2.getName().length()
            : o2.getName().length() - o1.getName().length();
      case AGE:
        return (personEnum.isAscend())
            ? o1.getAge() - o2.getAge()
            : o2.getAge() - o1.getAge();
      default:
        throw new EnumConstantNotPresentException(PersonEnum.class, personEnum.name());
    }
  }
}
