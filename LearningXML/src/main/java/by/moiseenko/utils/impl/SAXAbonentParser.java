package by.moiseenko.utils.impl;

import by.moiseenko.entity.Abonent;
import by.moiseenko.utils.saxhandlers.SAXAbonentHandler;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class SAXAbonentParser {
  private static final Logger LOG = LogManager.getLogger(SAXAbonentParser.class.getName());

  private final SAXAbonentHandler abonentHandler;

  @Autowired
  public SAXAbonentParser(@Qualifier("SAXAbonentHandler") SAXAbonentHandler abonentHandler) {
    this.abonentHandler = abonentHandler;
  }

  public void parseXML(String path) throws ParserConfigurationException, SAXException, IOException {
    File xmlFile = new File(path);
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser parser = factory.newSAXParser();
    parser.parse(xmlFile, abonentHandler);
   }

   public List<Abonent> getAbonentsList(){
     return abonentHandler.getAllAbonents();
   }

}
