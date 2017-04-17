package fizzbuzz_exceptions;

/**
 * Created by Paul Hobbs on 4/7/2017.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        try {
            throw new FizzBuzzException(1, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FizzBuzzException extends Exception {
    private final int count;
    public FizzBuzzException(int i, FizzBuzzException e) throws FizzBuzzException {
        super(e);
        this.count = i;
        try {
            int a  = 1 / (101-i);
            throw new FizzBuzzException(i+1, this);
        } catch (ArithmeticException ex)  {
            //deliberately
        }
    }

    @Override
    public void printStackTrace() {
        try {
            if (count % 15 == 0) {
                throw new DivBy15();
            }
            if (count % 3 == 0) {
                throw new DivBy3();
            }
            if (count % 5 == 0) {
                throw new DivBy5();
            }
            System.out.println(count);
        } catch (DivBy15 ex) {
            System.out.println("FizzBuzz");
        } catch (DivBy3 ex) {
            System.out.println("Fizz");
        } catch (DivBy5 ex) {
            System.out.println("Buzz");
        } catch (Exception ex) {
            System.out.println("Some other kind of exception occured.");
            //This should never be called
        }

        try {
            getCause().printStackTrace();
        } catch (NullPointerException npe) {
            //deliberately
        }
    }
}