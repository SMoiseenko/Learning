package by.moiseenko.utils.saxhandlers;

import by.moiseenko.entity.Abonent;
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
 * @author moiseenko-s
 */

@Component
public class SAXAbonentHandler extends DefaultHandler {

  private static final Logger LOG = LogManager.getLogger(SAXAbonentHandler.class.getName());
  private List<Abonent> abonents;
  private String lastElement, id, firstName, lastName, ipAddress, gender, eMail;

  @Override
  public void startElement(String uri, String localName, String qName, Attributes attributes)
      throws SAXException {
    lastElement = qName;
  }

  @Override
  public void characters(char[] ch, int start, int length) throws SAXException {
    String info = new String(ch, start, length);
    info = info.replace("\n", "").trim();

    if (!info.isEmpty()) {
      switch (lastElement) {
        case "id" -> id = info;
        case "first_name" -> firstName = info;
        case "last_name" -> lastName = info;
        case "email" -> eMail = info;
        case "gender" -> gender = info;
        case "ip_address" -> ipAddress = info;
      }


    }
  }

  @Override
  public void endElement(String uri, String localName, String qName) throws SAXException {
    if (abonents == null) {
      abonents = new ArrayList<>();
    }
    if(id!= null && firstName!=null && lastName != null && eMail != null && gender!= null && ipAddress!= null) {
      abonents.add(new Abonent(id, firstName, lastName, eMail, gender, ipAddress));
      id = firstName = lastName = eMail = gender = id = null;
    }
  }

  public List<Abonent> getAllAbonents(){
    return abonents;
  }

}
