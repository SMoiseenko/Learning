package by.moiseenko.utils.impl;

import by.moiseenko.utils.ValidatorSAX;
import by.moiseenko.utils.saxhandlers.MyXMLErrorHandler;
import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class ValidatorSAXImpl implements ValidatorSAX {

  private static final Logger LOG = LogManager.getLogger(ValidatorSAXImpl.class.getName());

  private MyXMLErrorHandler xmlErrorHandler;

  @Autowired
  public ValidatorSAXImpl(@Qualifier("myXMLErrorHandler") MyXMLErrorHandler xmlErrorHandler) {
    this.xmlErrorHandler = xmlErrorHandler;
  }

  @Override
  public boolean validateXMLbyXSD(String xml, String xsd) {
    Schema schema = null;
    boolean result = false;
    SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
    try{
      schema = factory.newSchema(new File(xsd));
      SAXParserFactory spf = SAXParserFactory.newInstance();
      spf.setNamespaceAware(true);
      spf.setSchema(schema);
      SAXParser parser = spf.newSAXParser();
      parser.parse(xml, new DefaultHandler(){
        @Override
        public void error(SAXParseException e) throws SAXException {
          throw e;
        }
      });
      result = true;
      System.out.println(xml + " is valid");
    } catch (ParserConfigurationException e) {
      LOG.error(xml + " config error:" + e.getMessage());
    } catch (SAXException e) {
      LOG.error(xml + " SAX error:" + e.getMessage());
    } catch (IOException e) {
      LOG.error("I/O error:" + e.getMessage());
    }
    return result;
  }
}
