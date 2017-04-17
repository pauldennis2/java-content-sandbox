/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class FBETest {
    public static void main(String[] args) {
        for (int index = 1; index <= 100; index++) {
            try {
                if (index % 15 == 0) {
                    throw new DivBy15();
                }
                if (index % 3 == 0) {
                    throw new DivBy3();
                }
                if (index % 5 == 0) {
                    throw new DivBy5();
                }
                System.out.println(index);
            } catch (DivBy15 ex) {
                System.out.println("FizzBuzz");
            } catch (DivBy3 ex) {
                System.out.println("Fizz");
            } catch (DivBy5 ex) {
                System.out.println("Buzz");
            }
        }
    }
}
class DivBy3 extends Exception{
}
class DivBy5 extends Exception {
}
class DivBy15 extends Exception {
}
