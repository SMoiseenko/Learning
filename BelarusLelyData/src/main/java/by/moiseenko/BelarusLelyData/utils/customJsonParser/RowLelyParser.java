package by.moiseenko.BelarusLelyData.utils.customJsonParser;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RowLelyFromJson;
import by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson.AstronautDataLelyFromJson;
import by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson.CustomerDataLelyFromJson;
import by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson.DownTimeDataLelyFromJson;
import by.moiseenko.BelarusLelyData.entity.entityFromJson.lelyEntityFromJson.FarmDataLelyFromJson;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

public class RowLelyParser extends JsonDeserializer<RowLelyFromJson> {

  @Override
  public RowLelyFromJson deserialize(JsonParser jsonParser,
      DeserializationContext deserializationContext) throws IOException {
    ObjectCodec oc = jsonParser.getCodec();
    JsonNode node = oc.readTree(jsonParser);

    if (node.has("WindowsOS")) {
      return CustomerDataLelyFromJson.builder()
          .lceMovexCode(node.get("LceMovexCode").asText())
          .lceName(node.get("LceName").asText())
          .sfdfarmlicense(node.get("sfdfarmlicense").asText())
          .sfdcustomermovexcode(node.get("sfdcustomermovexcode").asText())
          .sfdcurrentversion(node.get("sfdcurrentversion").asText())
          .sfdnrrobots(node.get("sfdnrrobots").asInt())
          .sfdfarmname(node.get("sfdfarmname").asText())
          .sfdregion(node.get("sfdregion").asText())
          .robotAvg(node.get("RobotAvg").asDouble())
          .build();
    }
    if (node.has("TotalMilkProduction")) {
      return FarmDataLelyFromJson.builder()
          .totalMilkProduction(node.get("TotalMilkProduction").asDouble())
          .build();
    }
    if (node.has("BenDevName")) {
      return DownTimeDataLelyFromJson.builder().build();
    }
    if (node.has("RobotSW")) {
      return AstronautDataLelyFromJson.builder().build();
    }
    return null;
  }
}
