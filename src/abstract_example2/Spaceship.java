package abstract_example2;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public abstract class Spaceship {

    protected int fuelRemaining;
    protected boolean isDestroyed;
    protected boolean isFlying;

    public Spaceship (int fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
        isDestroyed = false;
        isFlying = false;
    }

    public abstract void takeOff();

    public abstract void land();

    public abstract void refuel(int fuelAmount);

    //Accessor methods not shown
}
