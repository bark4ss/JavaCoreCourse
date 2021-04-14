package lesson13.lambda.util;

import lesson13.lambda.model.Car;
import lesson13.lambda.model.CarTypes;

public class ServiceCar {
    private int getCompactCarsNumber(Car[] cars) {
        int result = 0;
        for (Car car : cars) {
            if (car.getType().equals(CarTypes.COMPACT)) {
                result++;
            }
        }
        return result;
    }

    private int getExpensiveCarsNumber(Car[] cars) {
        int result = 0;
        for (Car car : cars) {
            if (car.getCost() > 20000) {
                result++;
            }
        }
        return result;
    }
}
