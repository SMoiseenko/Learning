package by.moiseenko.utils.impl;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Component
public class SAXGeoTagParser {

  private static final Logger LOG = LogManager.getLogger(SAXGeoTagParser.class.getName());

  private GeoTagHandler geoTagHandler;

  @Autowired
  public SAXGeoTagParser(@Qualifier("geoTagHandler") GeoTagHandler geoTagHandler) {
    this.geoTagHandler = geoTagHandler;
  }


  public void parseXML(String path) throws ParserConfigurationException, SAXException, IOException {
    File xmlFile = new File(path);
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser parser = factory.newSAXParser();
    parser.parse(xmlFile, geoTagHandler);
  }

  public void printResult() {
    if (geoTagHandler.getGeoTags() == null) {
      LOG.debug("You must use parser first");
    }
    String result = geoTagHandler.getGeoTags().stream().map(Objects::toString)
        .collect(Collectors.joining(",", "[", "]"));
    LOG.debug(result);
  }
}
