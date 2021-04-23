package lambda.util.impl;

import lambda.model.Car;
import lambda.model.CarTypes;
import lambda.util.Searchable;

public class CompactCarSearch implements Searchable {
    @Override
    public boolean test(Car car) {

        return car.getType().equals(CarTypes.COMPACT);
    }
}
