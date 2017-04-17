package fizzbuzz_exceptions;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class FizzBuzzNoEx {
    public static void main(String[] args) {
        for (int index = 1; index <= 100; index++) {
            if (index % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (index % 3 == 0) {
                System.out.println("Fizz");
            } else if (index % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(index);
            }
        }
    }
}
