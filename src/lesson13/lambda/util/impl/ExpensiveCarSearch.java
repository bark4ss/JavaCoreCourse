package lesson13.lambda.util.impl;

import lesson13.lambda.model.Car;
import lesson13.lambda.util.Searchable;

public class ExpensiveCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}
