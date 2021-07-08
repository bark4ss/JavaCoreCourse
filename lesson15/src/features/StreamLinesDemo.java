package features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLinesDemo {
    public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get("data.txt");

        String result = Files.readString(path);
        System.out.println(result);

        try (Stream<String> lineStream = Files.lines(path)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException ignored) {
        }
        System.out.println("======================");
        System.out.println(lines);
    }
}
