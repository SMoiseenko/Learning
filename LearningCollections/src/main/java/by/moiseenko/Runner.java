package by.moiseenko;

import by.moiseenko.entity.ListCollection;
import by.moiseenko.entity.SetCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {

    SetCollection.doAction();
    ListCollection.doAction();
  }
}
