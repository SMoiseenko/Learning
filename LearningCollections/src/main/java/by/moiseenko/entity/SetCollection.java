package by.moiseenko.entity;

import by.moiseenko.utils.PersonAgeComparator;
import by.moiseenko.utils.PersonNameComparator;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SetCollection {
  private static final Logger LOG = LogManager.getLogger(SetCollection.class.getName());

  public static void doAction() {
    LOG.debug("**************************SET COLLECTION*********************");

    Person youngIvanov = new Person("Ivanov", 12);
    Person oldIvanov = new Person("Ivanov", 68);
    Person youngPetrov = new Person("Petrov", 20);
    Person oldPetrov = new Person("Petrov", 102);
    Person youngSidorov = new Person("Sidorov", 8);
    Person oldSidorov = new Person("Sidorov", 54);

    Set<Person> myHashSet = new HashSet<>();

    boolean isMyHashSetEmpty = myHashSet.isEmpty();

    LOG.debug("Is myHashSet empty: " + isMyHashSetEmpty);
    myHashSet.add(youngIvanov);
    myHashSet.add(youngPetrov);
    myHashSet.add(youngSidorov);
    myHashSet.add(oldIvanov);
    myHashSet.add(oldPetrov);
    myHashSet.add(oldSidorov);

    for (Person person : myHashSet) {
      LOG.debug(person);
    }

    int myHashSetSize = myHashSet.size();

    LOG.debug("myHashSet size: " + myHashSetSize);

    isMyHashSetEmpty = myHashSet.isEmpty();

    LOG.debug("Is myHashSet empty: " + isMyHashSetEmpty);

    myHashSet.remove(youngPetrov);

    for (Person person : myHashSet) {
      LOG.debug(person);
    }

    boolean isContainsOldPetrov = myHashSet.contains(oldPetrov);
    boolean isContainsYoungPetrov = myHashSet.contains(youngPetrov);
    LOG.debug("Is myHashSet contains old Petrov: " + isContainsOldPetrov);
    LOG.debug("Is myHashSet contains young Petrov: " + isContainsYoungPetrov);

    Set<Person> myLinkedHashSet = new LinkedHashSet<>();
    myLinkedHashSet.add(youngIvanov);
    myLinkedHashSet.add(youngPetrov);
    myLinkedHashSet.add(youngSidorov);
    myLinkedHashSet.add(oldIvanov);
    myLinkedHashSet.add(oldPetrov);
    myLinkedHashSet.add(oldSidorov);

    Iterator<Person> linkedHashSetIteriator = myLinkedHashSet.iterator();
    while (linkedHashSetIteriator.hasNext()) {
      LOG.debug(linkedHashSetIteriator.next());
    }
    LOG.debug("My Hash Set Size: " + myHashSet.size());

    Comparator<Person> myComparator =
        new PersonNameComparator().thenComparing(new PersonAgeComparator());
    NavigableSet<Person> myTreeSet = new TreeSet<>(myComparator);

    myTreeSet.add(youngIvanov);
    myTreeSet.add(youngPetrov);
    myTreeSet.add(youngSidorov);
    myTreeSet.add(oldIvanov);
    myTreeSet.add(oldPetrov);
    myTreeSet.add(oldSidorov);

    Iterator<Person> treeSetIterator = myTreeSet.iterator();
    while (treeSetIterator.hasNext()) {
      LOG.debug(treeSetIterator.next());
    }

    try {
      SortedSet<Person> testWithOutComparator = new TreeSet<>();
      testWithOutComparator.add(youngIvanov);
    } catch (ClassCastException ex) {
      LOG.debug(ex);
    }

    Person sellinResult = myTreeSet.ceiling(new Person("MyPerson", 23));
    LOG.debug("sellinResult: " + sellinResult);
    Person floorResult = myTreeSet.floor(new Person("MyPerson", 23));
    LOG.debug("floorResult: " + floorResult);
    LOG.debug("myTreeSet size before pool two time: " + myTreeSet.size());
    Person poolFirstResult = myTreeSet.pollFirst();
    Person poolLastResult = myTreeSet.pollLast();
    LOG.debug("poolFirstResult: " + poolFirstResult);
    LOG.debug("poolLastResult: " + poolLastResult);

    LOG.debug("myTreeSet size after pool two time: " + myTreeSet.size());

    myTreeSet.add(youngIvanov);
    myTreeSet.add(oldSidorov);
    NavigableSet<Person> myTreeSetDescending = myTreeSet.descendingSet();
    for (Person person : myTreeSetDescending) {
      LOG.debug(person);
    }

    LOG.debug("*************************************************************");
  }
}
