package by.moiseenko.BelarusLelyData.utils.customJsonParser;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RootLelyFromJson;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class RootLelyJsonDeserializer {


  public RootLelyFromJson deserialize(String fileName) {
    ObjectMapper op = new ObjectMapper();
    RootLelyFromJson result = null;
    try {
      result = op.readValue(new File(fileName), RootLelyFromJson.class);
    } catch (IOException e) {
      e.printStackTrace();
    }

    return result;
  }

}
