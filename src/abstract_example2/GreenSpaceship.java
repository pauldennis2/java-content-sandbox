package abstract_example2;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class GreenSpaceship extends Spaceship {

    public GreenSpaceship () {
        //Since the GreenSpaceship doesn't require fuel
        //we will pass 0 fuel to the super constructor
        super (0);
    }

    //The GreenSpaceship doesn't require fuel; it can take off and land for free
    public void takeOff () {
        isFlying = true;
    }

    public void land () {
        isFlying = false;
    }

    //However if you try to refuel it there is a
    //10% chance there will be a smugness freakout
    //The ship will be destroyed if that happens
    public void refuel (int fuelAmount) {
        double roll = Math.random(); //A random number between 0.0 and 1.0
        if (roll > 0.1) {
            System.out.println("I don't need dirty fossil fuels, I'm a GREEN spaceship");
        } else {
            System.out.println("AH!!!! SMUGNESS FREAKOUT!!!");
            System.out.println("KABLOOOIE!");
            isDestroyed = true;
        }
    }
}
