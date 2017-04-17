public class AccessModifierExample {

    public String message; //This is like a public chalk board - anyone can write on it, erase it, etc.

    protected int weight; //Only this class and classes that extend it can access this variable directly

    private int secretCode; //Only this class has access

    public void printMessage () {
        System.out.println(message);
        helperMethod();
    }

    //Subclasses can find out what their secret code is but they're not allowed to change it.
    //(There is no "setSecretCode(int)" method
    protected int getSecretCode () {
        return secretCode;
    }

    //Private methods are "helper methods" - since they can't be called from outside of your class
    private void helperMethod () {
        System.out.println("Anyone can freely set 'message' to whatever they want.");
    }

    //Accessor method for protected int weight
    public int getWeight () {
        return weight;
    }
}
