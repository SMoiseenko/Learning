package by.moiseenko;

import by.moiseenko.config.SpringContextConfig;
//import by.moiseenko.entity.Abonent;
//import by.moiseenko.entity.Abonents;
import by.moiseenko.entity.Abonent;
import by.moiseenko.entity.Abonents;
import by.moiseenko.utils.ValidatorSAX;
import by.moiseenko.utils.saxhandlers.MyXMLErrorHandler;
import by.moiseenko.utils.saxhandlers.SAXAbonentHandler;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  public static void main(String[] args) throws Exception {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextConfig.class);
    ValidatorSAX validatorSAX = context.getBean(ValidatorSAX.class);
    validatorSAX.validateXMLbyXSD("src/main/resources/data/my_first_xml.xml",
        "src/main/resources/data/my_first_xml.xsd");

    SAXAbonentHandler abonentHandler = context.getBean(SAXAbonentHandler.class);
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser parser = factory.newSAXParser();
    parser.parse(new File("src/main/resources/data/my_first_xml.xml"), abonentHandler);


    abonentHandler.getAllAbonents().forEach((x)->System.out.println(x.toString()));

  }
}
