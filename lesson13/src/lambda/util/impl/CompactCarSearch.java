package lambda.util.impl;

import lambda.model.Car;
import lambda.model.CarTypes;

import java.util.function.Predicate;

public class CompactCarSearch implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getType().equals(CarTypes.COMPACT);
    }
}
