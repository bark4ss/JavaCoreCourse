package jaxbmarshall.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import jaxbmarshall.util.LocalDateAdapter;

import java.time.LocalDate;

@XmlType(propOrder = {"firstName","lastName","birthDay"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class, type = LocalDate.class)
    private LocalDate birthDay;
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(LocalDate birthDay, String firstName, String lastName) {
        this.birthDay = birthDay;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthDay=" + birthDay +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
