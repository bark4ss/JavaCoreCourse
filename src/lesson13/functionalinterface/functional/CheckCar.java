package lesson13.functionalinterface.functional;

import lesson13.functionalinterface.model.Car;

@FunctionalInterface
public interface CheckCar {
    boolean test(Car car);
}
