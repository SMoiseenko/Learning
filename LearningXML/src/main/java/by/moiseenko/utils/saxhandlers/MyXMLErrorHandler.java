package by.moiseenko.utils.saxhandlers;

import javax.security.sasl.SaslException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
public class MyXMLErrorHandler extends DefaultHandler {

  private static final Logger LOG = LogManager.getLogger(MyXMLErrorHandler.class.getName());

  @Override
  public void warning(SAXParseException e) throws SAXException {
    System.out.println(getLineAddress(e) + " - " + e.getMessage());
    throw e;

  }

  @Override
  public void error(SAXParseException e) throws SAXException {
    System.out.println(getLineAddress(e) + " - " + e.getMessage());
    throw e;
  }

  @Override
  public void fatalError(SAXParseException e) throws SAXException {
    System.out.println(getLineAddress(e) + " - " + e.getMessage());
    throw e;
  }

  private String getLineAddress(SAXParseException e){
    return e.getLineNumber() + ":" + e.getColumnNumber();
  }


}
