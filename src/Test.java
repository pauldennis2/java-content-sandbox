import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Paul Dennis on 4/10/2017.
 */
public class Test {

    public static void main(String[] args) {
        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());
        for (Object[] thing : splitUpNames) {
            System.out.println(thing);
            for (Object o : thing) {
                System.out.println("\t" + o);
            }
        }
        List<String[]> splitUpNomes = Arrays.asList("Paul Dennis", "Jack Bauer").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

        for (String[] thing : splitUpNomes) {
            System.out.println(thing);
            for (String s : thing) {
                System.out.println("\t" + s);
            }
        }

        List<Integer> lengths = Arrays.asList("Paul Dennis", "Jack Cook").stream()
                .map(name -> name.length())

                .collect(Collectors.toList());

        for (Integer i : lengths) {
            System.out.println("I = " + i);
        }
    }
}
