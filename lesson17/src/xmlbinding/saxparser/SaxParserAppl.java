package xmlbinding.saxparser;

import org.xml.sax.SAXException;
import xmlbinding.model.Company;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SaxParserAppl {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //https://javarush.ru/groups/posts/620-konkurs-osnovih-xml-dlja-java-programmista---chastjh-1-iz-3
        //https://www.infoworld.com/article/2076207/validation-with-java-and-xml-schema--part-2.html
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        CompanyHandler handler = new CompanyHandler();

        saxParser.parse("employee.xml", handler);

        Company result = handler.getCompany();
        System.out.println(result);

    }
}
