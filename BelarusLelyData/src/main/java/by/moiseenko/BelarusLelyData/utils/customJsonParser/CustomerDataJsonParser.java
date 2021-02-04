package by.moiseenko.BelarusLelyData.utils.customJsonParser;

import by.moiseenko.BelarusLelyData.entity.CustomerData;
import by.moiseenko.BelarusLelyData.entity.LSO;
import by.moiseenko.BelarusLelyData.entity.LicenseType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

public class CustomerDataJsonParser extends StdDeserializer<CustomerData> {

  protected CustomerDataJsonParser(Class<?> vc) {
    super(vc);
  }

  protected CustomerDataJsonParser(JavaType valueType) {
    super(valueType);
  }

  protected CustomerDataJsonParser(StdDeserializer<?> src) {
    super(src);
  }

  @Override
  public CustomerData deserialize(JsonParser jsonParser,
      DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    Long id = 1L;

    String movexCode = node.get("sfdfarmname").asText();
    String engName = node.get("sfdfasfdcustomermovexcodermname").asText();
    String t4CVersion = node.get("sfdcurrentversion").asText();
    return new CustomerData(id, movexCode, new LSO("", "", ""), engName, new LicenseType("FARM"),
        t4CVersion);
  }
}
