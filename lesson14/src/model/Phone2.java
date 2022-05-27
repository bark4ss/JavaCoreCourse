package model;

import java.util.Optional;
import java.util.Random;

public class Phone2 {
    private String name;
    private int price;

    public Phone2(){

    }

    public Phone2(String name) {
        this.name = name;
    }

    public Phone2(String name, int price) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<Phone2> getRandom() {
        Random random = new Random();
        return random.nextInt() %2 == 0 ? Optional.ofNullable(null) : Optional.of(new Phone2("Mike"));
    }

    @Override
    public String toString() {
        return "Phone2{" +
                "name='" + name + '\'' +
                '}';
    }
}
