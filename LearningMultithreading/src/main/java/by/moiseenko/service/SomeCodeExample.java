package by.moiseenko.service;

import static by.moiseenko.service.ConcurrentUtils.sleep;
import static by.moiseenko.service.ConcurrentUtils.stop;

import by.moiseenko.entity.Counter;
import by.moiseenko.entity.InterruptedThread;
import by.moiseenko.entity.Summator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.IntStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class SomeCodeExample {

  private static final Logger LOG = LogManager.getLogger(SomeCodeExample.class.getName());

  private static int z = 10;

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
        TimeUnit.SECONDS.sleep(5);
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

  public static void doActionSecond(boolean isActive) {
    if (isActive) {
      Thread thread = new DivideInThread(10.00d, 50.00d);
      LOG.debug(((DivideInThread) thread).getResult());
      thread.setDaemon(false);
      thread.start();
      LOG.debug(((DivideInThread) thread).getResult());
      if (true) throw new NullPointerException();
      try {
        thread.join();
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      LOG.debug(((DivideInThread) thread).getResult());
    }
  }

  public static void doActionThird(boolean isActive) {
    if (isActive) {
      Counter counter = new Counter();
      for (int i = 0; i < 20; i++) {
        Thread thread = new Thread(new CounterUsedThread(counter));
        thread.start();
      }
      try {
        TimeUnit.SECONDS.sleep(10);
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      LOG.debug("FINAL COUNTER VALUE = " + counter.getCount());
    }
  }

  public static void doActionFourth(boolean isActive) {
    if (isActive) {

      Thread thread = new InterruptedThread("PLEASE< INTERRUPT ME");
      thread.start();
      try {
        TimeUnit.SECONDS.sleep(5L);
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      LOG.debug("TRYING INTERRUPT THREAD: " + thread.getName());
      thread.interrupt();
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      LOG.debug(
          (!thread.isAlive())
              ? "THREAD WAS INTERRUPTED SUCCESSFUL"
              : "THREAD WAS NOT INTERRUPTED!!!");
    }
  }

  public static void doActionFifth(boolean isActive) {
    if (isActive) {
      Counter counter = new Counter();
      ExecutorService executorService = Executors.newFixedThreadPool(2);
      for (int i = 0; i < 20; i++) {
        executorService.execute(new CounterUsedThread(counter));
      }
      executorService.shutdown();
      try {
        while (!executorService.awaitTermination(24, TimeUnit.HOURS)) {}
      } catch (InterruptedException ie) {
        LOG.error(ie);
      }
      LOG.debug(counter.getCount());
    }
  }

  public static void doActionSixth(boolean isActive) {
    if (isActive) {
      ExecutorService executorService = Executors.newFixedThreadPool(1);
      Callable<String> tack =
          () -> {
            URL url = new URL("https://aws.random.cat/meow");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setRequestMethod("GET");
            //            LOG.debug(httpsURLConnection.getContentType());
            BufferedReader br =
                new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
              sb.append(line);
            }
            TimeUnit.SECONDS.sleep(3L);
            return sb.toString();
          };
      Future<String> future = executorService.submit(tack);
      executorService.shutdown();

      try {
        LOG.debug(future.get(6, TimeUnit.SECONDS));
      } catch (InterruptedException | ExecutionException | TimeoutException e) {
        e.printStackTrace();
      }
    }
  }

  public static void doActionSeventh(boolean isActive) {
    if (isActive) {

      VoidMethod voidMethod = (s -> System.out.println(s));

      voidMethod.doSomething("HELLO");

      ((VoidMethod) System.out::println).doSomething("WTF");

      ReturnedMethod returnedMethod = (a, b) -> a + " " + b;

      LOG.debug(returnedMethod.doSomthing("one", "two"));
      final int a = 500;
      Calculator calculator =
          (x, y) -> {
            x += a;
            x += z;
            z = 1000;
            return x + y;
          };
      int result = calculator.calc(10, 20);

      LOG.debug(result);
      LOG.debug(z);

      Generic<Integer> integerGeneric = (x, y) -> x + y;
      Generic<String> stringGeneric = (x, y) -> x + y;

      int a1 = integerGeneric.summ(10, 40);
      LOG.debug(a1);
      String s1 = stringGeneric.summ("10", "40");
      LOG.debug(s1);

      EmptyMethod emptyMethod = new TestClass("hello", "world");
      emptyMethod.doThis();

      EmptyMethod em1 = method("A", "B");
      em1.doThis();
    }
  }

  public static void doActionEighth(boolean isActive) {
    if (isActive) {
      List<String> resultList = new ArrayList<>();
      ExecutorService executorService = Executors.newWorkStealingPool();
      List<Callable<String>> taskList =
          Arrays.asList(
              () -> {
                TimeUnit.SECONDS.sleep(1);
                return "Task 01";
              },
              () -> {
                TimeUnit.SECONDS.sleep(2);
                return "Task 02";
              },
              () -> {
                TimeUnit.SECONDS.sleep(3);
                return "Task 03";
              },
              () -> {
                TimeUnit.SECONDS.sleep(4);
                return "Task 04";
              },
              () -> {
                TimeUnit.SECONDS.sleep(5);
                return "Task 05";
              });

      List<Future<String>> futureList = new ArrayList<>();
      try {
        futureList = executorService.invokeAll(taskList);
        for (Future<String> fs : futureList) {
          resultList.add(fs.get().toLowerCase());
        }
      } catch (InterruptedException | ExecutionException e) {
        LOG.error(e);
      }
      LOG.debug(resultList);
    }
  }

  public static void doActionNinth(boolean isActive) {
    if (isActive) {
      Runnable task =
          () -> LOG.debug(LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH-mm-ss")));

      ScheduledExecutorService scheduledExecutorService =
          Executors.newSingleThreadScheduledExecutor();
      scheduledExecutorService.scheduleAtFixedRate(task, 10L, 5L, TimeUnit.SECONDS);
    }
  }

  public static void doActionTenth(boolean isActive) {
    if (isActive) {
      ExecutorService executorService = Executors.newFixedThreadPool(1000);
      LOG.debug(z);
      Runnable task =
          () -> {
        sleep(1);
            count();
            LOG.debug(z);
          };

      IntStream.range(0,1000).forEach(i -> executorService.submit(task));
      stop(executorService);
      count();
      LOG.debug(z);

    }
  }

  private static  synchronized void count() {
    z = z + 1;
  }

  private static EmptyMethod method(String a, String b) {
    return () -> {
      String result;
      result = a + "-=-" + b;
      LOG.debug(result);
    };
  }
}

@FunctionalInterface
interface VoidMethod {
  void doSomething(String s);
}

@FunctionalInterface
interface EmptyMethod {
  void doThis();
}

@FunctionalInterface
interface ReturnedMethod {
  String doSomthing(String a, String b);
}

@FunctionalInterface
interface Calculator {
  int calc(int x, int y);
}

@FunctionalInterface
interface Generic<T> {
  T summ(T a, T b);
}

class TestClass implements EmptyMethod {

  private String a;
  private String b;

  public TestClass(String a, String b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public void doThis() {
    System.out.println(a);
    System.out.println(b);
  }
}
