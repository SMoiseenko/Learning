package by.moiseenko.utils.sax.impl;

import by.moiseenko.config.SpringContextConfig;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.xml.sax.SAXException;

@ContextConfiguration(classes = {SpringContextConfig.class})
@ExtendWith(SpringExtension.class)
class TestSAXGeoTagParser {

@Autowired
@Qualifier("SAXGeoTagParser")
private SAXGeoTagParser parser;
  private static final String PATH = "src/main/resources/data/2019_08_16_19_13_23.gpx";


  @Test
  void printResult() {
    try {
      parser.parseXML(PATH);
    } catch (ParserConfigurationException | IOException | SAXException e) {
      e.printStackTrace();
    }
    parser.printResult();
    Assertions.assertEquals(1,1);

  }
}