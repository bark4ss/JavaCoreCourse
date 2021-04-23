package streamAPI;

import java.util.stream.Stream;

public class StreamOfDemo2 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.forEach(s->System.out.println(s));
        System.out.println("===========================");
        Stream<String> citiesStreamFiler = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStreamFiler.filter(s->s.length()==6).forEach(s->System.out.println(s));
    }
}
