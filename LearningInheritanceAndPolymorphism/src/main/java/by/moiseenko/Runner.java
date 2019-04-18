package by.moiseenko;

import by.moiseenko.entity.ClassA;
import by.moiseenko.entity.ClassB;
import by.moiseenko.entity.ClassC;
import by.moiseenko.entity.Dumb;
import by.moiseenko.entity.Dumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.pattern.NamePatternConverter;

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

    ClassC classC = new ClassC();
    classC.sayName(NAME, VAL);
    classC.sayName(NAME);

    ClassA classA2 = new ClassC();
    classA2.sayName(NAME);

    ((ClassC)classA2).sayName(NAME, VAL);
    classA2.sayName(NAME);

    Dumb dumb = new Dumber();

    LOG.debug(dumb.getId());
    new Dumber().printID();

  }
}
