package by.moiseenko.utils.dom;

import by.moiseenko.entity.RunGeoTag;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class RunGeoTagDomParser {

  private static final Logger LOG = LogManager.getLogger(RunGeoTagDomParser.class.getName());

  private List<RunGeoTag> geoTagList;

  public void parse(String path) throws ParserConfigurationException, IOException, SAXException {

    String lat, lon, ele = null, hr = null, time = null;
    if (geoTagList == null) {
      geoTagList = new ArrayList<>();
    }
    DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(path);
    NodeList nodeList = document.getElementsByTagName("trkpt");
    for (int i = 0; i < nodeList.getLength(); i++) {
      NamedNodeMap attributes = nodeList.item(i).getAttributes();
      lat = attributes.getNamedItem("lat").getNodeValue();
      lon = attributes.getNamedItem("lon").getNodeValue();

      NodeList childNodes = nodeList.item(i).getChildNodes();
      for (int k = 0; k < childNodes.getLength(); k++) {
        if (childNodes.item(k).getNodeType() != Node.TEXT_NODE) {
          switch (childNodes.item(k).getNodeName()) {
            case "time" -> time = childNodes.item(k).getFirstChild().getNodeValue();
            case "ele" -> ele = childNodes.item(k).getFirstChild().getNodeValue().replace("\n", "")
                .trim();
            case "extensions" -> {
              if (childNodes.item(k).hasChildNodes())
                if (childNodes.item(k).getChildNodes().item(1).hasChildNodes())
                  if (childNodes.item(k).getChildNodes().item(1).getChildNodes().item(1)
                      .hasChildNodes())
                    hr = childNodes.item(1).getChildNodes().item(1).getChildNodes().item(0)
                        .getNodeValue();
            }
          }
        }
        geoTagList.add(new RunGeoTag(lat, lon, hr, ele, time));

      }
    }
  }

  public List<RunGeoTag> getGeoTagList() {
    return geoTagList;
  }
}
