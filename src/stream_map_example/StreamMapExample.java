package stream_map_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {
        List<NumberString> numberStrings = Arrays.asList("Blah", "Bli p", "Bloo op", "Beeple").stream()
                .map(name -> name.length()) //Go from the Strings ^^ to their lengths
                .map(e -> new NumberString(e)) //Go from the lengths to NumberString objects
                .collect(Collectors.toList());

        for (NumberString ns : numberStrings) {
            System.out.println(ns.getValue());
            System.out.println(ns.name);
        }

    }
}
