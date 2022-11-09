package by.moiseenko.service;

import static by.moiseenko.service.ConcurrentUtils.sleep;
import static by.moiseenko.service.ConcurrentUtils.stop;

import by.moiseenko.entity.Auction;
import by.moiseenko.entity.Bid;
import by.moiseenko.entity.Car;
import by.moiseenko.entity.Consumer;
import by.moiseenko.entity.Counter;
import by.moiseenko.entity.CrudeOil;
import by.moiseenko.entity.Goods;
import by.moiseenko.entity.InterruptedThread;
import by.moiseenko.entity.Item;
import by.moiseenko.entity.ParkingLot;
import by.moiseenko.entity.ParkingZone;
import by.moiseenko.entity.Payment;
import by.moiseenko.entity.PriceDisplay;
import by.moiseenko.entity.Producer;
import by.moiseenko.entity.Resource;
import by.moiseenko.entity.Shop;
import by.moiseenko.entity.Student;
import by.moiseenko.entity.Summator;
import by.moiseenko.entity.SyncAlphabetList;
import by.moiseenko.entity.Task;
import by.moiseenko.entity.Truck;
import by.moiseenko.entity.Tutor;
import by.moiseenko.entity.Warehouse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Phaser;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
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

  private static ReentrantLock lock = new ReentrantLock();

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
      ExecutorService executorService = Executors.newFixedThreadPool(2);
      LOG.debug(z);
      Runnable task =
          () -> {
            lock.lock();
            try {
              count();
            } finally {
              lock.unlock();
            }
            //            LOG.debug(z);
          };

      IntStream.range(0, 10000).forEach(i -> executorService.submit(task));
      stop(executorService);
      count();
      LOG.debug(z);
    }
  }

  public static void doActionEleventh(boolean isActive) {
    if (isActive) {
      SyncAlphabetList syncAlphabetList = new SyncAlphabetList();
      ExecutorService executorService = Executors.newFixedThreadPool(2);
      Runnable tack1 =
          () -> {
            for (char c = '\u0041'; c < '\u005B'; c++) {
              syncAlphabetList.addChar(c);
            }
          };
      Runnable task2 =
          () -> {
            LOG.info(syncAlphabetList.toString());
          };

      executorService.submit(tack1);
      executorService.submit(task2);
      executorService.submit(task2);

      stop(executorService);
    }
  }

  public static void doActionTwelfth(boolean isAction) {
    if (isAction) {
      Semaphore semaphore = new Semaphore(2);
      ExecutorService executorService = Executors.newFixedThreadPool(10);
      Runnable task =
          () -> {
            try {
              if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                LOG.debug("LOCKED");
                sleep(2);
                semaphore.release();
                LOG.debug("UNLOCKED");

              } else {
                LOG.debug(" WAS NOT LOCKED");
              }

            } catch (InterruptedException e) {
              LOG.error(e);
            }
          };

      IntStream.range(0, 10).forEach(i -> executorService.submit(task));

      stop(executorService);

      new Thread(
              () -> {
                sleep(3);
                Thread.currentThread().interrupt();
              })
          .start();
    }
  }

  public static void doActionThirteenth(boolean isActive) {
    if (isActive) {

      CrudeOil crudeOil = new CrudeOil("OIL-THREAD", 50);
      crudeOil.start();

      for (int i = 1; i < 10 + 1; i++) {
        new PriceDisplay(crudeOil, i).start();
      }
    }
  }

  public static void doActionFourteenth(boolean isActive) {
    if (isActive) {
      Resource res = new Resource("data/res.txt");
      ThreadResourceWriter thr1 = new ThreadResourceWriter(res, "FIRST");
      ThreadResourceWriter thr2 = new ThreadResourceWriter(res, "SECOND");

      try {
        thr2.start();
        thr1.start();
        thr1.join();
        thr2.join();
      } catch (InterruptedException ie) {
        LOG.debug(ie);
      } finally {
        res.close();
      }
    }
  }

  public static void doActionFifteenth(boolean isActive) {
    if (isActive) {
      final Payment payment = new Payment();
      Runnable task =
          () -> {
            payment.doPayment();
          };
      Thread thread = new Thread(task);
      thread.start();
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      synchronized (payment) {
        LOG.debug("Init amount: ");
        payment.initAmount();
        payment.notify();
      }
      synchronized (payment) {
        try {
          payment.wait(1_000);
        } catch (InterruptedException e) {
          LOG.error(e);
        }
        LOG.debug("OK");
      }
    }
  }

  public static void doActionSixteenth(boolean isAction) {
    if (isAction) {
      final BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(5);
      Thread t1 =
          new Thread(
              () -> {
                for (int i = 0; i < 20; i++) {
                  try {
                    //                Thread.sleep((long) (Math.random() * 1000));
                    blockingQueue.put(String.valueOf(i));
                    LOG.debug("Element " + i + " added!");
                  } catch (InterruptedException ie) {
                    LOG.error(ie);
                  }
                }
              });
      Thread t2 =
          new Thread(
              () -> {
                for (int i = 0; i < 17; i++) {
                  String element;
                  try {
                    element = blockingQueue.take();
                    LOG.debug("Taken " + element);
                    Thread.sleep((long) (Math.random() * 500));
                  } catch (InterruptedException ie) {
                    LOG.error(ie);
                  }
                }
              });
      try {
        t1.start();
        t2.start();
        t1.join();
        t2.join();
      } catch (InterruptedException ie) {
        LOG.error(ie);
      }
      LOG.debug(blockingQueue);
    }
  }

  public static void doActionSeventeenth(boolean isAction) {
    if (isAction) {
      Queue<ParkingLot> parkingLots =
          new LinkedList<>(
              Arrays.asList(
                  new ParkingLot("ONE"),
                  new ParkingLot("TWO"),
                  new ParkingLot("THREE"),
                  new ParkingLot("FOUR"),
                  new ParkingLot("FIVE")));
      ParkingZone parkingZone = new ParkingZone(parkingLots);

      for (int i = 1; i < 20; i++) {
        new Car(String.valueOf(i), parkingZone).start();
      }
    }
  }

  public static void doActionEighteenth(boolean isActive) {
    if (isActive) {
      Auction auction = new Auction();
      for (int i = 0; i < Auction.BIDS_NUMBER; i++) {
        Bid bid = new Bid(i, new Random().nextInt(100), auction);
        auction.addBid(bid);
        bid.start();
      }
    }
  }

  public static void doActionNineteenth(boolean isAction) {
    if (isAction) {
      final int NUMBER_TASK_1 = 5;
      Student studentOne = new Student(111, NUMBER_TASK_1);
      for (int i = 0; i < NUMBER_TASK_1; i++) {
        studentOne.addTask(new Task("Task# " + i));
      }
      final int NUMBER_TASK_2 = 7;
      Student studentTwo = new Student(222, NUMBER_TASK_2);
      for (int i = 0; i < NUMBER_TASK_2; i++) {
        studentTwo.addTask(new Task("Task# " + i));
      }

      List<Student> studentList = Arrays.asList(studentOne, studentTwo);

      Tutor tutor = new Tutor(studentList);

      studentOne.start();
      studentTwo.start();

      try {
        TimeUnit.SECONDS.sleep(5L);
      } catch (InterruptedException e) {
        LOG.error(e);
      }

      tutor.start();
    }
  }

  public static void doActionTwentieth(boolean isActive) {
    if (isActive) {
      final Integer itemId = 1;
      Item itemOne = new Item(itemId, 300);
      Item itemTwo = new Item(itemId, 250);

      new Thread(new Producer("BIOCOM TECHNOLOGY", itemOne)).start();
      new Thread(new Consumer("PROGRESS VERTELISHKI", itemTwo)).start();
    }
  }

  public static void doActionTwentyFirst(boolean isAction) {
    if (isAction) {

      Item item = new Item(1, 100);
      ItemService itemService = new ItemService(item);
      Runnable taskOne =
          () -> {
            itemService.getItem();
          };

      Runnable taskTwo =
          () -> {
            Integer idItem = new Random().nextInt(10);
            Integer number = new Random().nextInt(100);
            itemService.setItem(new Item(idItem, number));
          };

      for (int i = 0; i < 10; i++) {
        new Thread(taskOne).start();
        new Thread(taskTwo).start();
      }
    }
  }

  public static void doActionTwentySecond(boolean isAction) {
    if (isAction) {
      Goods[] goods = new Goods[20];
      for (int i = 0; i < goods.length; i++) {
        goods[i] = new Goods(i + 1);
      }

      List<Goods> listGoods = Arrays.asList(goods);

      Warehouse warehouseA = Warehouse.createWarehouse(listGoods.size(), listGoods);
      Warehouse warehouseB = Warehouse.createWarehouse(listGoods.size());

      Phaser phaser = new Phaser();
      phaser.register();
      int currentPhase;

      Thread truck1 = new Thread(new Truck(phaser, "ONE", 5, warehouseA, warehouseB));
      Thread truck2 = new Thread(new Truck(phaser, "TWO", 4, warehouseA, warehouseB));
      Thread truck3 = new Thread(new Truck(phaser, "THREE", 6, warehouseA, warehouseB));

      inventoryWarehouse(warehouseA, "warehouse A");
      inventoryWarehouse(warehouseB, "warehouse B");

      truck1.start();
      truck2.start();
      truck3.start();

      currentPhase = phaser.getPhase();
      phaser.arriveAndAwaitAdvance();
      LOG.debug("All trucks are loaded, phase " + currentPhase + " end.");

      currentPhase = phaser.getPhase();
      phaser.arriveAndAwaitAdvance();
      LOG.debug("All trucks  are finished their trip, phase " + currentPhase + " end.");

      currentPhase = phaser.getPhase();
      phaser.arriveAndAwaitAdvance();
      LOG.debug("All trucks are unloaded, phase " + currentPhase + " end.");

      phaser.arriveAndDeregister();
      if(phaser.isTerminated()){
        LOG.debug("ALL PHASES ARE FINISHED !!!");
      }

      inventoryWarehouse(warehouseA, "warehouse A");
      inventoryWarehouse(warehouseB, "warehouse B");
    }
  }

  public static void doActionTwentyThird(boolean isActive){
    if(isActive){

      ReentrantLock lock = new ReentrantLock();
      Shop shop = new Shop(lock);
      Buyer buyer = new Buyer(shop);
      Provider provider = new Provider(shop, buyer);
      buyer.start();
      provider.start();




    }
  }

  private static void inventoryWarehouse(Warehouse warehouse, String warehouseName) {
    Iterator<Goods> iterator = warehouse.iterator();
    StringBuilder sb =
        new StringBuilder()
            .append("Goods on warehouse ")
            .append(warehouseName)
            .append('\n')
            .append('[');

    while (iterator.hasNext()) {
      sb.append(iterator.next().getRegistrationNumber()).append(' ');
    }

    sb.deleteCharAt(sb.length()-1);
    sb.append(']');
    LOG.debug(sb.toString());
  }

  private static void count() {
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
