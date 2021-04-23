package lambda.model;

public class Car {
    private int cost;
    private CarTypes type;

    public Car() {
    }

    public Car(CarTypes type, int cost) {
        this.cost = cost;
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public CarTypes getType() {
        return type;
    }
}
