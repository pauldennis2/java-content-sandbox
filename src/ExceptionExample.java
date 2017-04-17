import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Paul Dennis on 4/6/2017.
 */
public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Please input a number");
        getNumberAndDiscuss();

        System.out.println("Now input something that's not a number.");
        getNumberAndDiscuss();

        System.out.println("(No discussion if you didn't enter a number)");
    }

    public static void getNumberAndDiscuss() throws NumberFormatException {
        //String input = System.console().readLine();
        String input = new Scanner(System.in).nextLine();

        int response = Integer.parseInt(input);

        System.out.println("Now let's have a long discussion about the number.");
        System.out.println(".....");
        System.out.println("The number you entered was " + response + ". Cool number!");
        System.out.println("Great discussion!");
    }

    public static void function () {
        //Here are some examples of how the compiler will effectively convert from primitive to box types for us
        List<Integer> numbers = new ArrayList<>();
        int x = 5;
        numbers.add(x); //This works
        Integer y = x;
        Integer z = new Integer(7);
        numbers.add(z);
        int w = numbers.get(0);
        Double d = 2.9;
        Float f = 2.129f;
        d += 1.0;
        f /= 9293;

        //Giraffe[] giraffes = new Giraffe[]{new Giraffe("Mindy"), new Giraffe("Sandy"), new Giraffe("Cindy")};

        Giraffe[] giraffes = new Giraffe[3];
        giraffes[0] = new Giraffe("Mindy");
        giraffes[1] = new Giraffe("Sandy");
        giraffes[2] = new Giraffe("Cindy");
    }

}
