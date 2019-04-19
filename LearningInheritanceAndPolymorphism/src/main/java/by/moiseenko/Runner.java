package by.moiseenko;

import by.moiseenko.entity.ClassA;
import by.moiseenko.entity.ClassB;
import by.moiseenko.entity.ClassC;
import by.moiseenko.entity.Dumb;
import by.moiseenko.entity.Dumber;
import by.moiseenko.entity.Point1D;
import by.moiseenko.entity.Point2D;
import by.moiseenko.entity.Point3D;
import by.moiseenko.entity.PointReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {
  private static final String NAME = "VASYA";
  private static final int VAL = 10;
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

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
  }
}
