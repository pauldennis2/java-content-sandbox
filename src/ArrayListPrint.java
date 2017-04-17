import java.util.*;
import java.util.stream.Collectors;

//import static java.util.stream.Collectors.toList;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class ArrayListPrint {

    public static void main(String[] args) {


        /*List list = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long");
        list.stream().map(name -> name.split(" "));
        splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
                .map(name -> name.split(" "))
                .collect(Collectors.toList());*/



        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        //.limit(2) //Once we've mapped two things, stop?
                        .collect(Collectors.toList());
        System.out.println(twoEvenSquares);

        ArrayList myList = new ArrayList();

        Random random = new Random();
        String name = "Mary Lou";
        Integer time = 7;

        myList.add(random);
        myList.add(name);
        myList.add(time);

        Object[] myArray = new Object[3];
        myArray[0] = random;
        myArray[1] = name;
        myArray[2] = time;


    }
}
