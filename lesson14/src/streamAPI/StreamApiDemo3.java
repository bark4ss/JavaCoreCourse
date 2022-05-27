package streamAPI;

import model.Phone;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo3 {
    public static void main(String[] args) {
        Phone test = new Phone("iPhone 6 S", 54000);
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStream.filter(test::temp2).forEach(p->System.out.println(p.getName()));
        System.out.println("=====================");
        Stream<Phone> phoneStreamMap = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));

        phoneStreamMap
                .map(p->p.getName()) // помещаем в поток только названия телефонов
                .filter(el -> el.length() > 10)
                .forEach(System.out::println);
        System.out.println("=======================");

        List<Phone> listPhoneName = List.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
        List<String> phoneName =  listPhoneName.stream().map(Phone::getName).collect(Collectors.toList());
        phoneName.forEach(System.out::println);
    }
}
