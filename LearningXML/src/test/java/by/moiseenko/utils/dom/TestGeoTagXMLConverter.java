package by.moiseenko.utils.dom;

import static org.junit.jupiter.api.Assertions.*;

import by.moiseenko.config.SpringContextConfig;
import by.moiseenko.utils.MyGeoTagParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SpringContextConfig.class})
@ExtendWith(SpringExtension.class)
class TestGeoTagXMLConverter {

  @Qualifier("SAXGeoTagParser")
  @Autowired
  private MyGeoTagParser parser;
  private final String pathToSource = "/home/moiseenko-s/IdeaProjects/Learning/LearningXML/src/main/resources/data/2019_06_30_19_26_57.xml";
  private final String pathToSave = "/home/moiseenko-s/IdeaProjects/Learning/LearningXML/src/main/resources/data/converted_2019_06_30_19_26_57.xml";

  @Test
  public void testConvertXML(){
    GeoTagXMLConverter converter = new GeoTagXMLConverter();
    converter.convertXML(parser, pathToSource, pathToSave);
    assertTrue(true);

  }


}