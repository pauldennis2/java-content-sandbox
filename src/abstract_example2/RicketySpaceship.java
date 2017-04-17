package abstract_example2;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class RicketySpaceship extends Spaceship {


    public RicketySpaceship (int fuelRemaining) {
        super (fuelRemaining);
    }

    public void takeOff () {
        //The RicketySpaceship requires 10 fuel points to take off
        if (fuelRemaining > 10) {
            fuelRemaining -= 10;
            isFlying = true;
        } else {
            fuelRemaining = 0;
        }
    }

    public void land () {
        //Because this is a RicketySpaceship
        //there's a 10% chance when it lands it will explode! Yikes
        double roll = Math.random(); //A random number between 0.0 and 1.0
        if (roll < 0.1) {
            isDestroyed = true;
            fuelRemaining = 0;
            System.out.println("KABLOOOIE!");
        }
    }

    public void refuel (int fuelAmount) {
        fuelRemaining += fuelAmount;
    }
}
