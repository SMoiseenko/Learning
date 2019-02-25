package by.moiseenko.entity;

import by.moiseenko.utils.PersonAgeComparator;
import by.moiseenko.utils.PersonNameComparator;
import org.apache.log4j.Logger;

import java.util.*;

public class SetCollection {
    private static final Logger logger = Logger.getLogger(SetCollection.class);


    public static void doAction(){
        logger.debug("**************************SET COLLECTION*********************");

        Person youngIvanov = new Person("Ivanov", 12);
        Person oldIvanov = new Person("Ivanov", 68);
        Person youngPetrov = new Person("Petrov", 20);
        Person oldPetrov = new Person("Petrov", 102);
        Person youngSidorov = new Person("Sidorov", 8);
        Person oldSidorov = new Person("Sidorov", 54);

        Set<Person> myHashSet = new HashSet<>();

        boolean isMyHashSetEmpty = myHashSet.isEmpty();

        logger.debug("Is myHashSet empty: " + isMyHashSetEmpty);
        myHashSet.add(youngIvanov);
        myHashSet.add(youngPetrov);
        myHashSet.add(youngSidorov);
        myHashSet.add(oldIvanov);
        myHashSet.add(oldPetrov);
        myHashSet.add(oldSidorov);

        for (Person person : myHashSet) {
            logger.debug(person);
        }

        int myHashSetSize = myHashSet.size();

        logger.debug("myHashSet size: " + myHashSetSize);

        isMyHashSetEmpty = myHashSet.isEmpty();

        logger.debug("Is myHashSet empty: " + isMyHashSetEmpty);

        myHashSet.remove(youngPetrov);

        for (Person person : myHashSet) {
            logger.debug(person);
        }

        boolean isContainsOldPetrov = myHashSet.contains(oldPetrov);
        boolean isContainsYoungPetrov = myHashSet.contains(youngPetrov);
        logger.debug("Is myHashSet contains old Petrov: " + isContainsOldPetrov);
        logger.debug("Is myHashSet contains young Petrov: " + isContainsYoungPetrov);

        Set<Person> myLinkedHashSet = new LinkedHashSet<>();
        myLinkedHashSet.add(youngIvanov);
        myLinkedHashSet.add(youngPetrov);
        myLinkedHashSet.add(youngSidorov);
        myLinkedHashSet.add(oldIvanov);
        myLinkedHashSet.add(oldPetrov);
        myLinkedHashSet.add(oldSidorov);

        Iterator<Person> linkedHashSetIteriator = myLinkedHashSet.iterator();
        while (linkedHashSetIteriator.hasNext()) {
            logger.debug(linkedHashSetIteriator.next());
        }
        logger.debug("My Hash Set Size: " + myHashSet.size());


        Comparator<Person> myComparator = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        NavigableSet<Person> myTreeSet = new TreeSet<>(myComparator);

        myTreeSet.add(youngIvanov);
        myTreeSet.add(youngPetrov);
        myTreeSet.add(youngSidorov);
        myTreeSet.add(oldIvanov);
        myTreeSet.add(oldPetrov);
        myTreeSet.add(oldSidorov);

        Iterator<Person> treeSetIterator = myTreeSet.iterator();
        while (treeSetIterator.hasNext()) {
            logger.debug(treeSetIterator.next());
        }


        try {
            SortedSet<Person> testWithOutComparator = new TreeSet<>();
            testWithOutComparator.add(youngIvanov);
        } catch (ClassCastException ex) {
            logger.debug(ex);
        }


        Person sellinResult = myTreeSet.ceiling(new Person("MyPerson", 23));
        logger.debug("sellinResult: " + sellinResult);
        Person floorResult = myTreeSet.floor(new Person("MyPerson", 23));
        logger.debug("floorResult: " + floorResult);
        logger.debug("myTreeSet size before pool two time: " + myTreeSet.size());
        Person poolFirstResult = myTreeSet.pollFirst();
        Person poolLastResult = myTreeSet.pollLast();
        logger.debug("poolFirstResult: " + poolFirstResult);
        logger.debug("poolLastResult: " + poolLastResult);

        logger.debug("myTreeSet size after pool two time: " + myTreeSet.size());

        myTreeSet.add(youngIvanov);
        myTreeSet.add(oldSidorov);
        NavigableSet<Person> myTreeSetDescending = myTreeSet.descendingSet();
        for(Person person: myTreeSetDescending){
            logger.debug(person);
        }

        logger.debug("*************************************************************");
    }
}
