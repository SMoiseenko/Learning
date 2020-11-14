package by.moiseenko.utils.sax.impl;

import by.moiseenko.entity.RunGeoTag;
import by.moiseenko.utils.MyGeoTagParser;
import by.moiseenko.utils.sax.saxhandlers.GeoTagHandler;
import java.io.File;
import java.io.IOException;
import java.util.List;
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
public class SAXGeoTagParser implements MyGeoTagParser {

  private static final Logger LOG = LogManager.getLogger(SAXGeoTagParser.class.getName());

  private final GeoTagHandler geoTagHandler;

  @Autowired
  public SAXGeoTagParser(@Qualifier("geoTagHandler") GeoTagHandler geoTagHandler) {
    this.geoTagHandler = geoTagHandler;
  }


  public void parse(String path) throws ParserConfigurationException, SAXException, IOException {
    File xmlFile = new File(path);
    SAXParserFactory factory = SAXParserFactory.newInstance();
    factory.setNamespaceAware(true);
    SAXParser parser = factory.newSAXParser();
    parser.parse(xmlFile, geoTagHandler);
  }

  public void printResult() {
    if (geoTagHandler.getGeoTags() == null) {
      LOG.debug("You must use parser first");
    } else{
    String result = geoTagHandler.getGeoTags().stream().map(Objects::toString)
        .collect(Collectors.joining(",", "[", "]"));
    LOG.debug(result);
  }
  }

  public GeoTagHandler getGeoTagHandler(){
    return geoTagHandler;
  }

  @Override
  public List<RunGeoTag> getGeoTagList() {
    return geoTagHandler.getGeoTags();
  }
}
