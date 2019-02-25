package by.moiseenko;

import by.moiseenko.entity.ListCollection;
import by.moiseenko.entity.Person;
import by.moiseenko.entity.SetCollection;
import org.apache.log4j.Logger;

public class Runner {
    private static final Logger logger = Logger.getLogger(Runner.class);

    public static void main(String[] args) {



        SetCollection.doAction();
        ListCollection.doAction();

    }


}
