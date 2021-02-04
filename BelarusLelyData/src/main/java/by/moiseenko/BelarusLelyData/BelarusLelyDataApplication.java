package by.moiseenko.BelarusLelyData;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RootLelyFromJson;
import by.moiseenko.BelarusLelyData.utils.customJsonParser.RootLelyJsonDeserializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelarusLelyDataApplication {

  public static void main(String[] args) {
    //SpringApplication.run(BelarusLelyDataApplication.class, args);
    RootLelyJsonDeserializer jd = new RootLelyJsonDeserializer();
    RootLelyFromJson rootLelyFromJson = jd.deserialize(
        "/home/moiseenko-s/Downloads/LelyDataJSON/CustomerData__01.01.2000-02.02.2021.json");
    if (rootLelyFromJson != null) {
      rootLelyFromJson.getData().getRows().stream().forEach(System.out::println);
    }


  }

}
