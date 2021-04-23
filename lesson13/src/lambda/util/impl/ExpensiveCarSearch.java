package lambda.util.impl;

import lambda.model.Car;
import lambda.util.Searchable;

public class ExpensiveCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {
        return car.getCost() > 20000;
    }
}
