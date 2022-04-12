package demo;

import comp.Human;
import model.Person;
import model.Profession;
import model.Calculator;

import static java.lang.Math.*;


public class Application {
    public static void main(String[] args) {
        Profession profession = new Profession();
        profession.setName("Nurse");
        Person person = new Person(198);
        Person person2 = new Person(168);
        Person person3 = new Person(168, 68);
        Person person4 = new Person("Julie", profession);

        double bodyIndex = 10;

        person.displayInfo();
        bodyIndex = person.getBodyIndex();//1
        System.out.println(bodyIndex);
        person2.displayInfo();
        bodyIndex = person2.getBodyIndex();//1
        System.out.println(bodyIndex);
        person3.displayInfo();
        bodyIndex = person3.getBodyIndex();//2
        System.out.println(bodyIndex);

        person4.displayName();
        person4.displayProfessionName();
        String temp = Person.className;
        int result = Calculator.multiply(3, 4);
        Calculator calc = new Calculator();
        result = calc.divide(8,2);
        System.out.println(result);
        abs(6.7);
    }
}
