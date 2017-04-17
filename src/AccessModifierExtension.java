/**
 * Created by Paul Dennis on 4/11/2017.
 */
public class AccessModifierExtension extends AccessModifierExample {
    /*
    @Override // <- Compiler error
    private void helperMethod () {

    }

    @Override //Legal, but we don't have access to the code itself
    protected int getSecretCode () {
        return secretCode; // <- Compiler error (Private access)
    }

    public void doSomething () {
        message = "Hello";
        weight = 5;
    }*/

    public static void main(String[] args) {
        //example
        int x = 5;
        if (x % 2 == 0) {
            System.out.println("It's div by 2");
        }


    }
}
