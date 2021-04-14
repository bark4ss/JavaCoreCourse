package lesson13.lambda.demo;

import lesson13.lambda.model.Car;
import lesson13.lambda.model.CarTypes;
import lesson13.lambda.util.Searchable;
import lesson13.lambda.util.impl.CompactCarSearch;
import lesson13.lambda.util.impl.ExpensiveCarSearch;

public class CarDemo2 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(CarTypes.COMPACT, 34000),
                new Car(CarTypes.SPORT, 44000),
                new Car(CarTypes.COMPACT, 14000),
                new Car(CarTypes.COMPACT, 10000),
        };

        CarDemo2 carDemo = new CarDemo2();
        //System.out.println(carDemo.getCarsNumber(cars, new CompactCarSearch()));
        //System.out.println(carDemo.getCarsNumber(cars, new ExpensiveCarSearch()));

        System.out.println(carDemo.getCarsNumber(cars, (Car car) -> car.getCost()>20000));
    }

    private int getCarsNumber(Car[] cars, Searchable s) {
        int result = 0;
        for (Car car : cars) {
            if (s.test(car)) {
                result++;
            }
        }
        return result;
    }
}
