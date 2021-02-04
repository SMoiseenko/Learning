package by.moiseenko.BelarusLelyData;

import by.moiseenko.BelarusLelyData.entity.entityFromJson.RootLelyFromJson;
import by.moiseenko.BelarusLelyData.utils.customJsonParser.RootLelyJsonDeserializer;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BelarusLelyDataApplication {

  private static final String HOME_PATH = "/home/s-moiseenko/Downloads/LelyDataJSON/CustomerData__01.01.2000-02.02.2021.json";
  private static final String WORK_PATH = "/home/moiseenko-s/Downloads/LelyDataJSON/CustomerData__01.01.2000-02.02.2021.json";

  public static void main(String[] args) {
    //  SpringApplication.run(BelarusLelyDataApplication.class, args);
    RootLelyJsonDeserializer jd = new RootLelyJsonDeserializer();
    RootLelyFromJson rootLelyFromJson = null;
    try {
      rootLelyFromJson = jd.deserialize(
          HOME_PATH);
    } catch (IOException e) {
      log.error(e.toString());
    }
    if (rootLelyFromJson != null) {
      rootLelyFromJson.getData().getRows().forEach(x -> log.debug(x.toString()));
    }


  }

}
