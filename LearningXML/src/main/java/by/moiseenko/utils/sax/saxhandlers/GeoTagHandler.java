package by.moiseenko.utils.sax.saxhandlers;

import by.moiseenko.entity.RunGeoTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  private String curElem, prefix, lat, lon, hR, ele, time;
  private Map<String, String> namespaces;

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    curElem = qName;
    prefix = namespaces.get(uri);
    if (qName.equals("trkpt")) {
      lat = attributes.getValue("lat");
      lon = attributes.getValue("lon");

    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {

    if (qName.equals("trkpt")) {
      if (geoTags == null) {
        geoTags = new ArrayList<>();
      }
//      if (lat != null && lon != null && time != null) {
//        geoTags.add(new RunGeoTag(lat, lon, hR, ele, time));
//      }
      if (ele == null) {
        ele = "-10028";
      }
      geoTags.add(new RunGeoTag(lat, lon, hR, ele, time));
      lat = lon = hR = ele = time = null;
    }
  }

  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    String info = new String(ch, start, length);
    info = info.replace("\n", "").trim();

    if (!info.isEmpty()) {
      if (curElem.equals(prefix.concat(":hr"))) {
        hR = info;
      }
      if (curElem.equals("ele")) {
        ele = info;
      }
      if (curElem.equals("time")){
        time = info.substring(0, info.length() - 1);
      }

    }

  }

  @Override
  public void startPrefixMapping(String prefix, String uri) throws SAXException {
    if (namespaces == null) {
      namespaces = new HashMap<>();
    }
    namespaces.put(uri, prefix);
  }

  public List<RunGeoTag> getGeoTags() {
    return geoTags;
  }
}
