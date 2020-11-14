package by.moiseenko.utils;

import by.moiseenko.entity.RunGeoTag;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface MyGeoTagParser {

  void parse(String path) throws ParserConfigurationException, IOException, SAXException;
  List<RunGeoTag> getGeoTagList();
}
