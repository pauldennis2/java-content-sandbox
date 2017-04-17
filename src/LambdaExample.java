/**
 * Created by Paul Dennis on 4/10/2017.
 */
public class LambdaExample {

    interface DivisibilityCheck {
        boolean checkDivisibility (int d);
    }

    public static void main(String[] args) {
        DivisibilityCheck divBy3 = (d) -> d % 3 == 0;
        DivisibilityCheck divBy5 = (d) -> d % 5 == 0;
        DivisibilityCheck divBy15 = (d) -> d % 15 == 0;

        for (int i = 1; i <= 100; i++) {
            if (divBy15.checkDivisibility(i)) {
                System.out.println("FizzBuzz");
            } else if (divBy3.checkDivisibility(i)) {
                System.out.println("Fizz");
            } else if (divBy5.checkDivisibility(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
