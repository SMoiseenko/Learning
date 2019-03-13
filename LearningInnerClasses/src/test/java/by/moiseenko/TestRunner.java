package by.moiseenko;

import org.testng.TestNG;
import org.testng.reporters.XMLSuiteResultWriter;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.IOException;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) throws IOException{


        final TestNG testNG = new TestNG(true);
        final Parser parser = new Parser("src/test/resources/testngAnnotation.xml");
        final List<XmlSuite> suites = parser.parseToList();
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}