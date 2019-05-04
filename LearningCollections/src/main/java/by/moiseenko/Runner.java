package by.moiseenko;

import by.moiseenko.entity.CollectionsClassExample;
import by.moiseenko.entity.ListCollection;
import by.moiseenko.entity.MapCollection;
import by.moiseenko.entity.SetCollection;
import by.moiseenko.utils.NetworkUserExamples;
import by.moiseenko.utils.SomeExercise;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {

    SetCollection.doAction(false);
    ListCollection.doAction(false);
    NetworkUserExamples.showMustGoOn(false);
    MapCollection.doAction(false);
    CollectionsClassExample.doAction(false);

    SomeExercise.readFromFileToArrayAndReverseIt("src/main/resources/fredie.txt");
    SomeExercise.numbersInStack();
  }
}
