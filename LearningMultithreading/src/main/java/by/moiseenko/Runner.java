package by.moiseenko;

import by.moiseenko.service.SomeCodeExample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {

    SomeCodeExample.doActionFirst(false);
    SomeCodeExample.doActionSecond(false);
    SomeCodeExample.doActionThird(false);
    SomeCodeExample.doActionFourth(false);
    SomeCodeExample.doActionFifth(false);
    SomeCodeExample.doActionSixth(false);
    SomeCodeExample.doActionSeventh(true);

    // END IS HERE
  }
}

