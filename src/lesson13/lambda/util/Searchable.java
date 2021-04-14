package lesson13.lambda.util;

import lesson13.lambda.model.Car;

@FunctionalInterface
public interface Searchable {
    boolean test(Car car);
}
