package by.moiseenko.utils;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface GetGeoTagInfoForGraphics {

  void init(String path) throws IOException, SAXException, ParserConfigurationException;
  String getCoordinates();
  String getElevations();
  String getHeartRates();


}
