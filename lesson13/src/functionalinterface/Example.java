package functionalinterface;

import functionalinterface.functional.CheckCar;
import functionalinterface.model.Car;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        //https://www.examclouds.com/java/java-core-russian/functional-interface-russian
        Car audiA3 = new Car("AudiA3", true, true);
        Car audiA6 = new Car("AudiA6",true,false);
        printTest(audiA3, c->c.isFullDrive());
        printTest(audiA3, c->c.isGasEngine());
        printTest(audiA6, c->c.isFullDrive());
        printTest(audiA6, c->c.isGasEngine());

    }

    private static void printTest(Car car, Predicate<Car> check) {
        if(check.test(car)) {
            System.out.println(car);
        }
    }
}
