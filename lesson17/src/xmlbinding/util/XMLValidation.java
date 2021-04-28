package xmlbinding.util;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidation {
    public static void main(String[] args) throws ParserConfigurationException, IOException {
        //https://www.rgagnon.com/javadetails/java-0668.html
        //https://www.liquid-technologies.com/online-xml-to-xsd-converter
        //http://www.quizful.net/post/getting-started-with-xml-in-java
        //https://www.liquid-technologies.com/xml-schema-tutorial/xsd-elements-attributes
        System.out.println(XMLUtils.validateWithDTDUsingDOM("employee.xml"));
        System.out.println(XMLUtils.validateWithDTDUsingSAX("employee1.xml"));

        System.out.println(validateXMLSchema("employee.xsd","employee.xml"));


    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath){

        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }
}
