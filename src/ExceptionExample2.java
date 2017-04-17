import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Paul Dennis on 4/6/2017.
 */
public class ExceptionExample2 {

    public static void main(String[] args) {
        while (true) {
            lotsOfExceptions();
        }
    }

    public static void lotsOfExceptions () {
        try {
            System.out.println("Choose your exception");
            System.out.println("0. NumberFormatException (just type in something that's not a number)");
            System.out.println("1. FileNotFoundException");
            System.out.println("2. ArrayIndexOutOfBoundsException");
            System.out.println("3. Other");
            String input = new Scanner(System.in).nextLine();
            //String input = System.console().readLine();
            int response = Integer.parseInt(input);

            switch (response) {
                case 1:
                    File doesntExist = new File ("blahblah.txt");
                    Scanner fileScanner = new Scanner(doesntExist);
                    break; //These are unnecessary
                case 2:
                    int[] x = {1};
                    System.out.println(x[2]);
                    break;
                case 3:
                    Object o = null;
                    o.hashCode();
            }
        } catch (NumberFormatException ex) {
            System.out.println("You chose the NumberFormatException");
        } catch (FileNotFoundException ex) {
            System.out.println("You chose the FileNotFoundException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("You chose the ArrayIndexOutOfBoundsException");
        } catch (Exception ex) {
            System.out.println("You chose Other (in this case a NullPointerException)");
        }
    }
}
