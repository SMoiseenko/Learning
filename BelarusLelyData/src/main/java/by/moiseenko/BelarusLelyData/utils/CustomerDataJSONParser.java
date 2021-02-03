package by.moiseenko.BelarusLelyData.utils;

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

public class CustomerDataJSONParser extends StdDeserializer<CustomerData> {

  protected CustomerDataJSONParser(Class<?> vc) {
    super(vc);
  }

  protected CustomerDataJSONParser(JavaType valueType) {
    super(valueType);
  }

  protected CustomerDataJSONParser(StdDeserializer<?> src) {
    super(src);
  }

  @Override
  public CustomerData deserialize(JsonParser jsonParser,
      DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    Long id = Long.valueOf(1);
    String movexCode = node.get("name");
    LSO lso;
    String engName;
    LicenseType licenseType;
    String t4CVersion;
    return new CustomerData(id, );
  }
}
