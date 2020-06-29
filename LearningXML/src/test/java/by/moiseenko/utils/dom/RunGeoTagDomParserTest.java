package by.moiseenko.utils.dom;

import static org.junit.jupiter.api.Assertions.*;

import by.moiseenko.config.SpringContextConfig;
import by.moiseenko.utils.sax.impl.TestLocalDateTimeParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SpringContextConfig.class})
@ExtendWith(SpringExtension.class)
class RunGeoTagDomParserTest {

  private static final Logger LOG = LogManager.getLogger(RunGeoTagDomParserTest.class.getName());

  @Autowired
  private RunGeoTagDomParser parser;
  private final String path = "/home/moiseenko-s/IdeaProjects/Learning/LearningXML/src/main/resources/data/2019_06_30_19_26_57.xml";

  @Test
  public void testParser() throws Exception{
    parser.parse(path);
    parser.getGeoTagList().forEach(LOG::debug);
    assertEquals(1, 1);
  }

}