package lesson13.lambda.util.impl;

import lesson13.lambda.model.Car;
import lesson13.lambda.model.CarTypes;
import lesson13.lambda.util.Searchable;

public class CompactCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {

        return car.getType().equals(CarTypes.COMPACT);
    }
}
