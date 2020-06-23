package by.moiseenko;

import by.moiseenko.config.SpringContextConfig;
//import by.moiseenko.entity.Abonent;
//import by.moiseenko.entity.Abonents;
import by.moiseenko.utils.ValidatorSAX;
import by.moiseenko.utils.impl.SAXGeoTagParser;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  public static void main(String[] args) throws Exception{
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextConfig.class);
    ValidatorSAX validatorSAX = context.getBean(ValidatorSAX.class);
    validatorSAX.validateXMLbyXSD("src/main/resources/data/my_first_xml.xml",
        "src/main/resources/data/my_first_xml.xsd");

    SAXGeoTagParser myParser = context.getBean(SAXGeoTagParser.class);
    myParser.parseXML("/home/s-moiseenko/Downloads/AMAZFIT/2019_08_16_19_13_23.gpx");
    myParser.printResult();


  }
}
