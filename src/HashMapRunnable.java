import java.util.HashMap;
import java.util.Scanner;

public class HashMapRunnable {

    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "One came first so it's the best");
        myMap.put(2, "Two is the first prime");
        myMap.put(5, "Five is an excellent number");
        myMap.put(8, "Eight is not that great");

        while (true) {
            System.out.println("Please enter a number to see what it maps to.");
            String input = new Scanner(System.in).nextLine();
            //String input = System.console().readLine();
            try {
                Integer key = Integer.parseInt(input);
                String value = myMap.get(key);
                if (value != null) {
                    System.out.println("Value associated with that key is: " + value);
                } else {
                    System.out.println("The key is not mapped (value is null)");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Exiting");
                break;
            }
        }
    }
}
