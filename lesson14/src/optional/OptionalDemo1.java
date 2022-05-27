package optional;

import model.Phone2;

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        //https://vertex-academy.com/tutorials/ru/java-8-optional/
        //Optional<String> name = Optional.of("John");
        //Optional<String> name = Optional.of(null); // java.lang.NullPointerException
        //Optional<String> name = Optional.ofNullable(null);
        Optional<String> name = Optional.empty();
        //System.out.println(name); //output Optional[John]

        Phone2 phone2 = new Phone2();
        Optional<Phone2> phone3 = phone2.getRandom();
        System.out.println(phone3.orElse(new Phone2("Antony")));
    }
}
