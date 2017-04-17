/**
 * Created by Paul Dennis on 4/10/2017.
 */
public class LambdaExample2 {


    interface FizzBuzz {
        String fizzBuzzOutput (int n);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = (n) -> {
            String response = "";
            if (n % 3 == 0) {
                response += "Fizz";
            }
            if (n % 5 == 0) {
                response += "Buzz";
            }
            if (response.equals("")) {
                response = "" + n;
            }
            return response;
        };
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.fizzBuzzOutput(i));
        }
    }
}
