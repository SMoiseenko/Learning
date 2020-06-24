package by.moiseenko.utils.impl;

import by.moiseenko.entity.RunGeoTag;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Component
public class GeoTagHandler extends DefaultHandler {

  private static final Logger LOG = LogManager.getLogger(GeoTagHandler.class.getName());

  private List<RunGeoTag> geoTags;
  private String lat, lon;

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    if (qName.equals("trkpt")) {
      lat = attributes.getValue("lat");
      lon = attributes.getValue("lon");
      if (geoTags == null) {
        geoTags = new ArrayList<>();
      }
      if (lat != null && lon != null) {
        geoTags.add(new RunGeoTag(lat, lon));
      }
    }
    lat = lon = null;
  }


  public List<RunGeoTag> getGeoTags() {
    return geoTags;
  }
}
