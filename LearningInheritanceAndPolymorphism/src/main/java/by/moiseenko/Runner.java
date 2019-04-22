package by.moiseenko;

import by.moiseenko.entity.ClassA;
import by.moiseenko.entity.ClassB;
import by.moiseenko.entity.ClassC;
import by.moiseenko.entity.Dumb;
import by.moiseenko.entity.Dumber;
import by.moiseenko.entity.Man;
import by.moiseenko.entity.MyAbstractClass;
import by.moiseenko.entity.Passport;
import by.moiseenko.entity.Point1D;
import by.moiseenko.entity.Point2D;
import by.moiseenko.entity.Point3D;
import by.moiseenko.entity.PointReport;
import java.util.ArrayList;
import java.util.List;
import by.moiseenko.utils.ManService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {
  private static final String NAME = "VASYA";
  private static final int VAL = 10;
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  //@SuppressWarnings(value = "unchecked")
  public static void main(String[] args) {
    ClassA classA = new ClassA();
    classA.sayName(NAME);

    ClassA classA1 = new ClassB();
    classA1.sayName(NAME);
    classA1.sayStaticName();

    ((ClassB) classA1).sayStaticName();

    ClassA classA12 = new ClassB("REEE");

    ClassC classC = new ClassC();
    classC.sayName(NAME, VAL);
    classC.sayName(NAME);

    ClassA classA2 = new ClassC();
    classA2.sayName(NAME);

    ClassA String = new ClassA();

    ((ClassC) classA2).sayName(NAME, VAL);
    classA2.sayName(NAME);

    Dumb dumb = new Dumber();

    LOG.debug(dumb.getId());
    new Dumber().printID();

    LOG.debug("********************");

    PointReport d = new PointReport();
    Point1D p1 = new Point1D(-7);
    d.printReport(p1);
    Point1D p2 = new Point2D(3, 4);
    d.printReport(p2);
    Point1D p3 = new Point3D(3, 4, 5);
    d.printReport(p3);

    Class<Number> cnumb = Number.class;

    List rawList = new ArrayList();
    rawList.add(1);
    rawList.add("LIST");
    String i1 = (String)rawList.get(0);
    Integer i2 = (Integer)rawList.get(1);

    List<? extends Object> simpleList = rawList;
    String o1 = (String)simpleList.get(0);
    Integer o2 = (Integer)simpleList.get(1);


    List<? super Point1D> wilcardList = new ArrayList();
    wilcardList.add(new Point3D());
    wilcardList.add(new Point1D(1));
    for(Object s: wilcardList ){
      System.out.println("s");
    }
    Object blabla = wilcardList.get(1);

    List<? super Number> nList = new ArrayList<>();



    List<? extends Point1D> wilcardExtedsList = new ArrayList<>();

    List<Object> objectList = new ArrayList<>();
    List<Integer> integerList = new ArrayList<>();

   // classA.superMethod(integerList);
    classA.superMethod(objectList);
   // classA.extendMethod(objectList);
    classA.extendMethod(integerList);



   }

    MyAbstractClass myAbstractClass =
        new MyAbstractClass() {
          @Override
          public void sayHello() {
            LOG.debug("HELLO FROM ANONIMUS CLASS");
          }
        };

    myAbstractClass.sayHello();
    MyAbstractClass.sayStatic();
    Passport passport = new Passport(178500L);

    Man man = new Man(1, "Siarhei", 32, passport);
    LOG.debug(man);
    ManService manService = new ManService();
    manService.manHardChanger(man);
    LOG.debug("MAN AFTER METHOD");
    LOG.debug(man);
    Man man1 = new Man(12, "Waswas", 18, new Passport(1253L));
    man1 = null;
    //

    try {
      for(int i = 0; i< 10; i++){
        System.out.println("try finallization");
        System.runFinalization();
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.gc();

  }
}
