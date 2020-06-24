package by.moiseenko.utils.impl;

import static org.junit.jupiter.api.Assertions.*;

import by.moiseenko.config.SpringContextConfig;
import by.moiseenko.entity.Abonent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.xml.sax.SAXException;


@ContextConfiguration(classes = {SpringContextConfig.class})
@ExtendWith(SpringExtension.class)
class TestSAXAbonentParser {

  @Autowired
  @Qualifier("SAXAbonentParser")
  private SAXAbonentParser parser;

  private static final String path = "src/test/resources/data/my_first_xml.xml";

  @Test
  void getAbonentsList() throws IOException, SAXException, ParserConfigurationException {
    List<Abonent> expectedList = new ArrayList<>(Arrays.asList(new Abonent("1","Isadore","Mation","imation0@soundcloud.com","Male","124.197.150.248")));
    parser.parseXML(path);
    assertEquals(expectedList, parser.getAbonentsList());

  }
}