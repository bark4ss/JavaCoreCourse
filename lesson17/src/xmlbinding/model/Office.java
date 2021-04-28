package xmlbinding.model;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private String floor;
    private String room;
    private List<Employee> employees;

    public Office(String floor, String room) {
        this.floor = floor;
        this.room = room;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "floor='" + floor + '\'' +
                ", room='" + room + '\'' +
                ", employees=" + employees +
                '}';
    }
}
