package by.moiseenko.utils.impl;

import static org.junit.jupiter.api.Assertions.*;

import by.moiseenko.config.SpringContextConfig;
import by.moiseenko.utils.ValidatorSAX;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {SpringContextConfig.class})
@ExtendWith(SpringExtension.class)
class TestValidatorSAXImpl {

  @Autowired
  @Qualifier("validatorSAXImpl")
  private ValidatorSAX validatorSAX;

  private static final String xml ="src/main/resources/data/my_first_xml.xml";
  private static final String xsd = "src/main/resources/data/my_first_xml.xsd";



  @Test
  void validateXMLbyXSD() {
    assertTrue(validatorSAX.validateXMLbyXSD(xml, xsd));
  }
}