package by.moiseenko;

import by.moiseenko.entity.MyThreadClass;
import by.moiseenko.service.CatPictureDownloader;
import by.moiseenko.service.SomeCodeExample;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Log4j2
public class Runner {

  @SneakyThrows
  public static void main(String[] args) {

    SomeCodeExample.doActionFirst(false);
    SomeCodeExample.doActionSecond(false);
    SomeCodeExample.doActionThird(false);
    SomeCodeExample.doActionFourth(false);
    SomeCodeExample.doActionFifth(false);
    SomeCodeExample.doActionSixth(false);
    SomeCodeExample.doActionSeventh(false);
    SomeCodeExample.doActionEighth(false);
    SomeCodeExample.doActionNinth(false);
    SomeCodeExample.doActionTenth(false);
    SomeCodeExample.doActionEleventh(false);
    SomeCodeExample.doActionTwelfth(false);
    SomeCodeExample.doActionThirteenth(false);
    SomeCodeExample.doActionFourteenth(false);
    SomeCodeExample.doActionFifteenth(false);
    SomeCodeExample.doActionSixteenth(false);
    SomeCodeExample.doActionSeventeenth(false);
    SomeCodeExample.doActionEighteenth(false);
    SomeCodeExample.doActionNineteenth(false);
    SomeCodeExample.doActionTwentieth(false);
    SomeCodeExample.doActionTwentyFirst(false);
    SomeCodeExample.doActionTwentySecond(false);
    SomeCodeExample.doActionTwentyThird(false);
    CatPictureDownloader.giveMeSomeCats(false);
    //    new LelyLicBinAnalyzer().analyze();
    log.debug("Main thread started");
    Thread t = new MyThreadClass("who is there");
    t.start();
    t.join();
    log.debug("Main thread ended");
    // END IS HERE
  }
}
