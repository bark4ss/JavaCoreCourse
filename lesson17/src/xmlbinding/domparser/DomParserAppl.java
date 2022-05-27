package xmlbinding.domparser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import xmlbinding.model.Company;
import xmlbinding.model.Employee;
import xmlbinding.model.Office;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParserAppl {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //https://howtodoinjava.com/java/xml/read-xml-dom-parser-example/
        File file = new File("employee.xml");
        Company company = parseCompanyXML(file);
        System.out.println(company);
    }

    private static Company parseCompanyXML(File name) throws ParserConfigurationException, SAXException, IOException
    {
        //Initialize a company
        Company company = new Company();
        List<String> names = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(name);
        document.getDocumentElement().normalize();
        NodeList nListCompany = document.getElementsByTagName("company");
        for (int i = 0; i < nListCompany.getLength(); i++) {
            Node nodeCompany = nListCompany.item(i);
            if (nodeCompany.getNodeType() == Node.ELEMENT_NODE) {
                Element eElementCompany = (Element) nodeCompany;
                company.setName(eElementCompany.getElementsByTagName("name").item(0).getTextContent());
                NodeList nListOffices = document.getElementsByTagName("office");
                company.setOffices(new ArrayList<>());
                for (int j = 0; j < nListOffices.getLength(); j++) {
                    Node nodeOffice = nListOffices.item(j);
                    if (nodeOffice.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElementOffice = (Element) nodeOffice;
                        Office office = new Office(eElementOffice.getAttribute("floor"), eElementOffice.getAttribute("room"));
                        office.setEmployees(new ArrayList<>());
                        NodeList nListEmployee = ((Element) nodeOffice).getElementsByTagName("employee");
                        for (int k = 0; k < nListEmployee.getLength(); k++) {
                            Node nodeEmployee = nListEmployee.item(k);
                            if(nodeEmployee.getNodeType() == Node.ELEMENT_NODE) {
                                Element eElementEmployee = (Element) nodeEmployee;
                                Employee employee = new Employee();
                                employee.setName(eElementEmployee.getAttribute("name"));
                                employee.setJob(eElementEmployee.getAttribute("job"));
                                office.getEmployees().add(employee);
                            }
                        }
                        company.getOffices().add(office);
                    }
                }
            }

        }
        NodeList nodeNames = document.getElementsByTagName("employee");
        for (int i=0;i<nodeNames.getLength();++i){
            Node nodeName = nodeNames.item(i);
            Element elementName = (Element) nodeName;
            names.add(elementName.getAttribute("name"));
        }
        return company;
    }
}
