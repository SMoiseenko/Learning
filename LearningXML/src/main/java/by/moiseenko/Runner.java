package by.moiseenko;

import by.moiseenko.config.SpringContextConfig;
//import by.moiseenko.entity.Abonent;
//import by.moiseenko.entity.Abonents;
import by.moiseenko.utils.ValidatorSAX;
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

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextConfig.class);
    ValidatorSAX validatorSAX = context.getBean(ValidatorSAX.class);
    validatorSAX.validateXMLbyXSD("src/main/resources/data/my_first_xml.xml",
        "src/main/resources/data/my_first_xml.xsd");

    /*Abonent a1 = new Abonent();
    a1.setId("1");
    a1.setFirstName("Andrea");
    a1.setLastName("Nikolete");
    a1.setGender("FEMALE");
    a1.setIp_address("127.0.0.1");
    a1.setEmail("a.nikolete@gmail.com");

    Abonents abonents = new Abonents();
    abonents.addAbonent(a1);

    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(Abonents.class, Abonent.class);
      Marshaller marshaller = jaxbContext.createMarshaller();
      StringWriter sw = new StringWriter();
      marshaller.marshal(abonents, sw);
      System.out.println(sw.toString());

    } catch (JAXBException e) {
      e.printStackTrace();
    }*/

  }
}
