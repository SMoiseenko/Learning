package by.moiseenko.service;

import by.moiseenko.entity.Counter;
import by.moiseenko.entity.Summator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class SomeCodeExample {

  private static final Logger LOG = LogManager.getLogger(SomeCodeExample.class.getName());

  public static void doActionFirst(boolean isAction) {
    if (isAction) {
      Thread mainThread = Thread.currentThread();
      ThreadGroup threadGroup = new ThreadGroup("MY THREAD GROUP");

      for (int i = 0; i < 10; i++) {
        new Thread(
            () -> {
              Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
              LOG.debug(
                  String.format(
                      "Hello from thread that called \"%s\", has priority \"%d\" and located in thread group \"%s\"",
                      Thread.currentThread().getName(),
                      Thread.currentThread().getPriority(),
                      Thread.currentThread().getThreadGroup().toString()));
            })
            .start();
      }

      Thread t1 =
          new Thread(
              threadGroup,
              () -> {
                LOG.debug(Thread.currentThread().getName());
                LOG.debug(Thread.currentThread().getThreadGroup());
                try {
                  Thread.sleep(10000);
                } catch (InterruptedException e) {
                  LOG.error(e);
                }
                LOG.debug(mainThread.getName() + "-=-" + mainThread.getState());
              },
              "NEW NAME");
      t1.start();
      Thread t2 = new Summator(threadGroup, "SUMMATOR", 10, 20, 30, 40, 50, 60, 70, 80, 90);
      t2.start();

      try {
        mainThread.sleep(5000);
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      mainThread.setName("Я ТУТ ГЛАВНЫЙ");
      LOG.debug(Thread.currentThread().getName());
      LOG.debug(t1.getState());
      LOG.debug(t2.getState());
      LOG.debug(mainThread.getState());
    }
  }
  public static void doActionSecond(boolean isActive){
    if (isActive){
      Thread thread = new DivideInThread(10.00d, 50.00d);
      LOG.debug(((DivideInThread) thread).getResult());
      thread.setDaemon(false);
      thread.start();
      LOG.debug(((DivideInThread) thread).getResult());
      if(true) throw new NullPointerException();
      try {
        thread.join();
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      LOG.debug(((DivideInThread) thread).getResult());
    }
  }
  public static void doActionThird(boolean isActive){
    if (isActive){

      for (int i = 0; i<100; i++){
        new Thread(()->{
          Counter.increaseCounter();
          LOG.debug(Counter.getCount());
        }).start();
      }

//      for (int i = 0; i<100; i++){
//        new Thread(()->{
//          Counter.decreaseCounter();
//          LOG.debug(Counter.getCount());
//        }).start();
//      }



    }
  }
}
