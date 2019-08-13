package by.moiseenko;

import by.moiseenko.config.SpringContextConfig;
import by.moiseenko.utils.ValidatorSAX;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    ValidatorSAX validatorSAX = context.getBean(ValidatorSAX.class) ;
    validatorSAX.validateXMLbyXSD("src/main/resources/data/my_first_xml.xml", "src/main/resources/data/my_first_xml.xsd");
  }
}
