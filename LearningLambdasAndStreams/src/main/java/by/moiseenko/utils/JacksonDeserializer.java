package by.moiseenko.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**

 * Default javadoc
 *
 * @author moiseenko-s
 */
public class JacksonDeserializer {

  private static final Logger LOG = LogManager.getLogger(JacksonDeserializer.class.getName());

  public <T> List<T> getDataFromJSON(String paths, Class<T[]> clazz) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    String json = "";

    try {
      json = Files.readString(Paths.get(paths));
    } catch (IOException e) {
      LOG.error(e);
    }
    return Arrays.asList(objectMapper.readValue(json, clazz));
  }

}
