package recursion_xamples;

public class SimpleRecursionExample {

    static long functionCounter;
    public static void main(String[] args) {
        /*for (int i = 0; i < 50; i++) {
            System.out.print(factorial(i));
            System.out.print("<==>");
            System.out.print(noRecursionFactorial(i));
            System.out.println();
        }*/

        functionCounter = 0;
        recursionLimit();
        System.out.println(functionCounter);
    }

    public static void recursionLimit () {
        functionCounter++;
        try {
            recursionLimit();
        } catch (StackOverflowError ex) {
            System.out.println("Alright I'm done.");
        }
    }

    public static long factorial (int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * (factorial(n-1)));
        }
    }

    public static int noRecursionFactorial (int n) {
        int response = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            response *= i;
        }
        return response;
    }
}
