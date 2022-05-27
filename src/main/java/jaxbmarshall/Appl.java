package jaxbmarshall;

import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jaxbmarshall.model.Group;
import jaxbmarshall.model.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;

public class Appl {

    public static void main(String[] args) {
        Appl appl = new Appl();
        //appl.marshallExample();
        System.out.println("Done");
        appl.unmarshallExample();
    }

    public static Group createGroup() {
        Group group = new Group();
        group.setName("Test group5");
        group.getMembers().add(
                new Person(LocalDate.of(2002, 10, 11), "Viktar", "Tsialiatka")
        );
        group.getMembers().add(
                new Person(LocalDate.of(2003, 10, 11), "Viktar2", "Tsialiatka2")
        );

        return group;
    }

    public void marshallExample() {
        try {
            File fileIn = new File("marshallGroup.xml");
            JAXBContext context = JAXBContext.newInstance(Group.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createGroup(), fileIn);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void unmarshallExample() {
        try {
            JAXBContext jaxbContext     = JAXBContext.newInstance( Group.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            InputStream inStream = new FileInputStream( "marshallGroup.xml" );
            Group group = (Group) jaxbUnmarshaller.unmarshal(inStream);
            System.out.println(group);
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
