package by.moiseenko.prototype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class RabbitBuilder implements Builder {

  private static final Logger LOG = LogManager.getLogger(RabbitBuilder.class.getName());

  private Rabbit rabbit;

  @Override
  public void init() {
    this.rabbit = new Rabbit();

  }

  @Override
  public void setName(String name) {
    this.rabbit.setName(name);
  }

  @Override
  public void setGender(String gender) {
    this.rabbit.setGender(Enum.valueOf(Gender.class, gender));
  }

  @Override
  public void setCharacteristic(String characteristic) {
    this.rabbit.setAge(Integer.parseInt(characteristic));
  }

  public Rabbit makeRabbit(){
    return this.rabbit;
  }
}
