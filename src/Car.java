/**
 * Created by Paul Dennis on 4/5/2017.
 */
public class Car {

    private int speed;
    private boolean isOn;

    public static final int MAX_SPEED = 50;
    public static final int ACCELERATION = 5;

    public boolean isOn () {
        return isOn;
    }

    public int getSpeed () {
        return speed;
    }

    //No direct set method for speed or isOn; instead whoever uses this class will use these methods:

    //Methods to access isOn
    public void start () {
        isOn = true;
    }

    public void stop () {
        if (speed == 0) {
            isOn = false;
        } else {
            System.out.println("Car must be motionless before it can be turned off.");
        }
    }

    //Methods to access speed
    public void accelerate () {
        if (isOn) {
            if (speed + ACCELERATION <= MAX_SPEED) {
                speed += ACCELERATION;
            } else {
                speed = MAX_SPEED;
            }
        }
    }

    public void slamBreaks () {
        speed = 0;
        //This sure would be an "interesting" car to drive!
    }
}
