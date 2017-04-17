import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList myNumbers = new ArrayList();
        myNumbers.add(5);
        myNumbers.add(2);
        myNumbers.add(6);

        int total = 0;
        for (Object o : myNumbers) {
            total += (Integer)o;
        }
        System.out.println("Total = " + total);

        myNumbers.add("Paul");

        total = 0;
        for (Object o : myNumbers) {
            total += (Integer)o;
        }
        System.out.println("Total = " + total);
    }
}
