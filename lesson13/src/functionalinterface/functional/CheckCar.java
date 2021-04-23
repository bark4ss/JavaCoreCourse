package functionalinterface.functional;

import functionalinterface.model.Car;

@FunctionalInterface
public interface CheckCar {
    boolean test(Car car);
}
