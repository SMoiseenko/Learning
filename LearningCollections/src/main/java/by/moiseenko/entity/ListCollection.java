package by.moiseenko.entity;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
    private static final Logger logger = Logger.getLogger(ListCollection.class);
    public static void doAction(){
        logger.debug("**************************ARRAY-LIST COLLECTION*********************");

        List<Person> myArrayList = new ArrayList<>();

        Person youngIvanov = new Person("Ivanov", 12);
        Person oldIvanov = new Person("Ivanov", 68);
        Person youngPetrov = new Person("Petrov", 20);
        Person oldPetrov = new Person("Petrov", 102);
        Person youngSidorov = new Person("Sidorov", 8);
        Person oldSidorov = new Person("Sidorov", 54);

        myArrayList.add(youngIvanov);
        myArrayList.add(oldIvanov);
        myArrayList.add(youngPetrov);
        myArrayList.add(oldPetrov);
        myArrayList.add(youngSidorov);
        myArrayList.add(oldSidorov);

        showAllElementsAndSize(myArrayList);

        Person get3Element = myArrayList.get(3);
        logger.debug("get3Element: " + get3Element);

        myArrayList.set(3, new Person("UnnamedPerson", 666));

        showAllElementsAndSize(myArrayList);

        myArrayList.add(3, oldPetrov);

        showAllElementsAndSize(myArrayList);

        myArrayList.remove(myArrayList.size()-1);

        showAllElementsAndSize(myArrayList);

        myArrayList.remove(oldPetrov);

        showAllElementsAndSize(myArrayList);

        ((ArrayList<Person>) myArrayList).trimToSize();

        showAllElementsAndSize(myArrayList);
        logger.debug("**************************LINKED-LIST COLLECTION*********************");

        LinkedList<Person> myLinkedList = new LinkedList<>();
        myLinkedList.add(youngIvanov);
        myLinkedList.add(oldIvanov);
        myLinkedList.add(youngPetrov);
        myLinkedList.add(oldPetrov);
        myLinkedList.add(youngSidorov);
        myLinkedList.add(oldSidorov);

        showAllElementsAndSize(myLinkedList);

        Person getFirstResult = myLinkedList.getFirst();











        logger.debug("*************************************************************");
    }

    private static void showAllElementsAndSize(List<?> myArrayList){
        Iterator myListIterator = myArrayList.listIterator();
        while (myListIterator.hasNext()){
            logger.debug(myListIterator.next());
        }
        int arraySize = myArrayList.size();
        logger.debug("arraySize: " + arraySize);


    }

}
