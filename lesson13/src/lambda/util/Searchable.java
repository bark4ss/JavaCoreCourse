package lambda.util;

import lambda.model.Car;

@FunctionalInterface
public interface Searchable {
    boolean test(Car car);
}
