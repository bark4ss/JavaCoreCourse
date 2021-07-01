package lambda.demo;

import lambda.model.Car;
import lambda.model.CarTypes;
import lambda.util.Searchable;
import lambda.util.impl.CompactCarSearch;
import lambda.util.impl.ExpensiveCarSearch;

import java.util.function.Predicate;

public class CarDemo2 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(CarTypes.COMPACT, 34000),
                new Car(CarTypes.SPORT, 44000),
                new Car(CarTypes.COMPACT, 14000),
                new Car(CarTypes.COMPACT, 10000),
        };

        Searchable carByprice = new Searchable() {
            @Override
            public boolean test(Car car) {
                return false;
            }
        };


        CarDemo2 carDemo = new CarDemo2();
        //System.out.println(carDemo.getCarsNumber(cars, new CompactCarSearch()));
        //System.out.println(carDemo.getCarsNumber(cars, new ExpensiveCarSearch()));

        System.out.println(carDemo.getCarsNumber(cars, car -> car.getCost()> 20000));
        System.out.println(carDemo.getCarsNumber(cars, car -> car.getType().equals(CarTypes.SPORT)));
    }

    private int getCarsNumber(Car[] cars, Predicate<Car> s) {
        int result = 0;
        for (Car car : cars) {
            if (s.test(car)) {
                result++;
            }
        }
        return result;
    }
}
