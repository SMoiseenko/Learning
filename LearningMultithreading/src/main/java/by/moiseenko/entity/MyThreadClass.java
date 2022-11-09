package by.moiseenko.entity;

import java.util.concurrent.TimeUnit;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

/**
 * Default javadoc
 *
 * @author S.Moiseenko
 */
@Log4j2
public class MyThreadClass extends Thread{

  public MyThreadClass(String name) {
    super(name);
  }

  @SneakyThrows
  @Override
  public void run() {
    log.debug(String.format("%s started.", Thread.currentThread().getName()));
    TimeUnit.SECONDS.sleep(1);
    log.debug(String.format("%s ended", Thread.currentThread().getName()));
   }
}
