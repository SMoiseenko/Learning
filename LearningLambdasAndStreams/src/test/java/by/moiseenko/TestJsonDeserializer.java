package by.moiseenko;

import by.moiseenko.entity.Worker;
import by.moiseenko.utils.JacksonDeserializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestJsonDeserializer {

  private static final Logger LOG = LogManager.getLogger(TestJsonDeserializer.class.getName());

  @Test
  void testDeserializer(){
    JacksonDeserializer deserializer = new JacksonDeserializer();
    List<Worker> result = new ArrayList<>();
    try {
      result = deserializer.getDataFromJSON("src/main/resources/MOCK_DATA.json", Worker[].class);
    } catch (JsonProcessingException e) {
      LOG.error(e);
    }
    result.forEach(LOG::debug);

  }

}
