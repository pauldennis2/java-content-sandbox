import java.io.Console;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Paul Dennis on 4/6/2017.
 */
public class BoxTypes {

    public static void main(String[] args) {
        //Integer.parseInt example
        while (true) {
            System.out.println("Please input a number.");

            //String input = System.console().readLine();
            String input = new Scanner(System.in).nextLine();

            try {
                int value = Integer.parseInt(input);
                System.out.println("You typed in the number " + value + ". Multiplied by 5 that's " + value * 5 + ".");
            } catch (NumberFormatException ex) {
                System.out.println("That wasn't a number. Goodbye.");
                break;
            }
        }
    }
}
