package lambda.util.impl;

import lambda.model.Car;

import java.util.function.Predicate;

public class ExpensiveCarSearch implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}
