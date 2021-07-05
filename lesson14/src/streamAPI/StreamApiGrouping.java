package streamAPI;

import model.AdvancedPhone;
import model.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiGrouping {
    public static void main(String[] args) {
        Stream<AdvancedPhone> phoneStream = Stream.of(new AdvancedPhone("iPhone X", "Apple", 600),
                new AdvancedPhone("Pixel 2", "Google", 500),
                new AdvancedPhone("iPhone 8", "Apple",450),
                new AdvancedPhone("Galaxy S9", "Samsung", 440),
                new AdvancedPhone("Galaxy S8", "Samsung", 340));

        Map<String, List<AdvancedPhone>> phonesByCompany = phoneStream.collect(
                Collectors.groupingBy(AdvancedPhone::getCompany));

        for(Map.Entry<String, List<AdvancedPhone>> item : phonesByCompany.entrySet()){

            System.out.println("Company:" + item.getKey());
            for(AdvancedPhone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
    }
}
