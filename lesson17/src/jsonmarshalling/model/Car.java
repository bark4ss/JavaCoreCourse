package jsonmarshalling.model;

public class Car {
    private String color;
    private String type;
    private Comfort comfort;

    public Car() {
    }

    public Car(String color, String type, Comfort comfort) {
        this.color = color;
        this.type = type;
        this.comfort = comfort;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Comfort getComfort() {
        return comfort;
    }

    public void setComfort(Comfort comfort) {
        this.comfort = comfort;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", comfort=" + comfort +
                '}';
    }
}
