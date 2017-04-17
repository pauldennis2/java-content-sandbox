package abstract_example2;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class NotASpaceship extends Spaceship {

    public NotASpaceship () {
        super (-1);
    }

    public void land () {
        System.out.println("Would you like some ice cream?");
    }

    public void takeOff () {
        System.out.println("How about french fries?");
    }

    public void refuel (int fuelAmount) {
        switch (fuelAmount) {
            case 0:
                System.out.println("Hamburger?");
                break;
            case 1:
                System.out.println("Pizza?");
                break;
            case 2:
                System.out.println("Fried chicken?");
                break;
            default:
                System.out.println("Ham sandwich?");
        }
    }
}
