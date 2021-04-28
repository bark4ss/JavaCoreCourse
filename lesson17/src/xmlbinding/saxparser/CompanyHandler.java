package xmlbinding.saxparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import xmlbinding.model.Company;
import xmlbinding.model.Employee;
import xmlbinding.model.Office;

import java.util.ArrayList;
import java.util.List;

public class CompanyHandler extends DefaultHandler {

    private static final String NAME = "name";
    private static final String OFFICES = "offices";
    private static final String OFFICE = "office";
    private static final String EMPLOYEES = "employees";
    private static final String EMPLOYEE = "employee";

    private static final String ATTR_EMPLOYEE_NAME = "name";
    private static final String ATTR_EMPLOYEE_JOB = "job";

    private static final String ATTR_OFFICE_FLOOR = "floor";
    private static final String ATTR_OFFICE_ROOM = "room";

    private Company company;
    private StringBuilder elementValue;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    @Override
    public void startDocument() throws SAXException {
        company = new Company();
    }

    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {
        switch (qName) {
            case OFFICES -> company.setOffices(new ArrayList<>());
            case OFFICE -> company.getOffices().add(new Office(attr.getValue(ATTR_OFFICE_FLOOR), attr.getValue(ATTR_OFFICE_ROOM)));
            case EMPLOYEES -> latestOffice().setEmployees(new ArrayList<>());
            case EMPLOYEE -> latestOffice().getEmployees().add(new Employee(attr.getValue(ATTR_EMPLOYEE_NAME),attr.getValue(ATTR_EMPLOYEE_JOB)));
            case NAME -> elementValue = new StringBuilder();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case NAME -> company.setName(elementValue.toString());
        }
    }

    private Office latestOffice() {
        List<Office> officeList = company.getOffices();
        int latestOfficeIndex = officeList.size() - 1;
        return officeList.get(latestOfficeIndex);
    }

    public Company getCompany() {
        return company;
    }
}
