import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Paul Dennis on 4/5/2017.
 */
public class FibonacciExample {

    static Map<Integer, Long> fibonacciMap;
    static long numFunctionCalls;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        fibonacciMap = new HashMap<Integer, Long>();
        initializeMapFromFile();
        System.out.println("Welcome to Fibonacci calculation. Put in a negative number to exit.");
        System.out.println("Fibonacci(0) = 0");
        System.out.println("Fibonacci(1) = 1");
        System.out.println("Fibonacci(2) = Fibonacci(2-1) + Fibonacci (2-2)");
        System.out.println("(i.e. sum of the previous two)");
        System.out.println("Beginning sequence goes like this: 1, 1, 2, 3, 5, 8, 13, 21...");
        while (true) {
            System.out.println("Calculate which Fibonacci number?");
            int response = inputScanner.nextInt();
            if (response < 0) {
                break;
            }
            if (response > 92) {
                System.out.println("Sorry, we cannot easily calculate over 92 as it overflows.");
                response = 92;
            }
            long startTime = System.currentTimeMillis();
            numFunctionCalls = 0;
            System.out.println("The " + response + "th Fibonacci is " + calcFibonacci(response));
            //System.out.println("The " + response + "th Fibonacci is " + calcMappedFibonacci(response));
            long endTime = System.currentTimeMillis();
            System.out.println("Processing completed in " + (endTime - startTime) + " milliseconds.");
            System.out.println("Completed in " + numFunctionCalls + " function calls.");
        }
        writeMapToFile();
        System.out.println("Goodbye!");
    }

    public static long calcFibonacci (int index) {
        numFunctionCalls++;
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        return calcFibonacci(index - 1) + calcFibonacci(index - 2);
    }

    public static long calcMappedFibonacci (int index) {
        numFunctionCalls++;
        if (fibonacciMap.get(index) == null) {
            fibonacciMap.put(index, calcMappedFibonacci(index - 1) + calcMappedFibonacci(index - 2));
        }
        return fibonacciMap.get(index);
    }

    public static void initializeMapFromFile () {
        File mapFile = new File("fib_map.txt");
        try {
            Scanner fileScanner = new Scanner(mapFile);
            while (fileScanner.hasNext()) {
                String token = fileScanner.nextLine();
                String[] numbers = token.split(" ");
                Integer index = Integer.parseInt(numbers[0]);
                Long value = Long.parseLong(numbers[1]);
                fibonacciMap.put(index, value);
                fibonacciMap.put(0, 0L);
                fibonacciMap.put(1, 1L);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            fibonacciMap.put(0, 0L);
            fibonacciMap.put(1, 1L);
        }
    }

    public static void writeMapToFile () {
        File mapFile = new File("fib_map.txt");
        try {
            FileWriter mapWriter = new FileWriter(mapFile);
            for (Integer index : fibonacciMap.keySet()) {
                String token = index + " " + fibonacciMap.get(index) + "\n";
                //System.out.println(token);
                mapWriter.write(token);
            }
            mapWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
