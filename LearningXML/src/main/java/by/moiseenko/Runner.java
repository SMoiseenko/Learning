package by.moiseenko;

import by.moiseenko.config.SpringContextConfig;
//import by.moiseenko.entity.Abonent;
//import by.moiseenko.entity.Abonents;
import by.moiseenko.entity.Abonent;
import by.moiseenko.entity.Abonents;
import by.moiseenko.utils.GetGeoTagInfoForGraphics;
import by.moiseenko.utils.ValidatorSAX;
import by.moiseenko.utils.impl.GetGeoTagInfoForGraphicsImpl;
import by.moiseenko.utils.impl.InterpolateWrongValues;
import by.moiseenko.utils.impl.SAXGeoTagParser;
import by.moiseenko.utils.saxhandlers.SAXAbonentHandler;
import java.io.File;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
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

  public static final String PATH2XML = "src/main/resources/data/2019_08_16_19_13_23.gpx";

  public static void main(String[] args) throws Exception {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextConfig.class);
    GetGeoTagInfoForGraphics tagInfo = context.getBean(GetGeoTagInfoForGraphicsImpl.class);
    tagInfo.init(PATH2XML);
    System.out.println(tagInfo.getCoordinates());
    System.out.println(tagInfo.getElevations());

  }
}
