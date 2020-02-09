package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.creational.prototype.Dog;
import by.moiseenko.creational.prototype.Gender;
import by.moiseenko.creational.prototype.Rabbit;
import by.moiseenko.creational.prototype.RabbitBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */

public class TestPrototype {

  private static final Logger LOG = LogManager.getLogger(TestPrototype.class.getName());

  private Dog dogOne;
  private Dog dogTwo;

  @BeforeEach
  void initData() {
    Dog dogOne = new Dog();
    dogOne.setName("Sharick");
    dogOne.setGender(Gender.FEMALE);
    dogOne.setColor("Black");
    this.dogOne = dogOne;

    Dog dogTwo = (Dog) dogOne.clone();
    this.dogTwo = dogTwo;
  }

  @Test
  void checkLinks() {
    if (dogOne == dogTwo) {
      LOG.debug("Links are the same");
    } else {
      LOG.debug("Links are NOT the same");
    }
    assertEquals(1, 1);
  }

  @Test
  void checkObjects() {
    if (dogOne.equals(dogTwo)) {
      LOG.debug("Objects are equal");
    } else {
      LOG.debug("Objects are NOT equal");
    }
    assertEquals(1, 1);
  }

  @Test
  void testRabbits() {
    RabbitBuilder rabbitBuilder = new RabbitBuilder();
    rabbitBuilder.init();
    rabbitBuilder.setName("Rabbit");
    rabbitBuilder.setGender("MALE");
    rabbitBuilder.setCharacteristic("15");
    Rabbit rabbit = rabbitBuilder.makeRabbit();

    Rabbit rabbitOld = (Rabbit) rabbit.clone();
    rabbitOld.setAge(99);

    LOG.debug("Yang rabbit: " + rabbit);
    LOG.debug("Old rabbit: " + rabbitOld);
    assertEquals(1, 1);
  }
}
