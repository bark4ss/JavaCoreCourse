package streamtasks;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class UniqueWordCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.
        task(text);
        scanner.close();

    }

    static void task(final String input) {
        Arrays.stream(
                requireNonNull(input, "input string can't be null")
                        .toLowerCase()
                        .split("[\\p{Blank}\\p{Punct}]+")
        )
                .collect(groupingBy(s -> s, counting()))
                .entrySet()
                .stream()
                .sorted(
                        (e0, e1) -> {
                            final int res = e1.getValue().compareTo(e0.getValue());
                            return res == 0 ? e0.getKey().compareTo(e1.getKey()) : res;
                        }
                )
                .limit(10)
                .forEach(System.out::println);
    }
}
