package by.moiseenko.utils.dom;

import by.moiseenko.entity.RunGeoTag;
import by.moiseenko.utils.MyGeoTagParser;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class GeoTagXMLConverter {
  private static final Logger LOG = LogManager.getLogger(GeoTagXMLConverter.class.getName());


  public boolean convertXML(MyGeoTagParser parser, String pathSource, String pathToSave){

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = null;

    try {
      builder = factory.newDocumentBuilder();
    } catch (ParserConfigurationException e) {
      LOG.error(e);
    }

    Document document = builder.newDocument();
    String root = "trk";
    Element rootElement = document.createElement(root);
    document.appendChild(rootElement);

    String nextEl = "trkseg";
    Element collectionElement = document.createElement(nextEl);

    try {
      parser.parse(pathSource);
    } catch (ParserConfigurationException | IOException | SAXException e) {
      LOG.error(e);
    }
    List<RunGeoTag> geoTagList = parser.getGeoTagList();
    if (geoTagList!= null){
      for(RunGeoTag tag : geoTagList){
        String trkpt = "trkpt";
        Element trkptElement = document.createElement(trkpt);
        trkptElement.setAttribute("time", tag.getTime().format(DateTimeFormatter.ISO_DATE_TIME));
        trkptElement.setAttribute("lat", String.valueOf(tag.getLat()));
        trkptElement.setAttribute("lon", String.valueOf(tag.getLon()));
        trkptElement.setAttribute("ele", String.valueOf(tag.getEle()));
        trkptElement.setAttribute("hr", String.valueOf(tag.gethR()));
        collectionElement.appendChild(trkptElement);

      }
    }
    rootElement.appendChild(collectionElement);

    TransformerFactory transformerFactory = TransformerFactory.newInstance();

    Transformer transformer = null;

    try {
      transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      DOMSource source = new DOMSource(document);
      StreamResult result = new StreamResult(new FileWriter(pathToSave));
      transformer.transform(source, result);
    } catch (TransformerException | IOException e) {
      LOG.error(e);
    }

    return false;
  }


}
