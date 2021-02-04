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


  public RootLelyFromJson deserialize(String fileName) throws IOException {
    ObjectMapper op = new ObjectMapper();
    return op.readValue(new File(fileName), RootLelyFromJson.class);
  }
}
