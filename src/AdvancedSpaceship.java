/**
 * Created by Paul Dennis on 4/6/2017.
 */
public class AdvancedSpaceship extends Spaceship {

    int shieldAmt;

    public AdvancedSpaceship (int health, int shieldAmt) {
        super(health);
        this.shieldAmt = shieldAmt;
    }

    @Override //This tells the compiler that we are overriding a method from the superclass
    public boolean takeDamage (int damageAmt) {
        if (shieldAmt > damageAmt) {
            damageAmt = 0;
        } else {
            damageAmt -= shieldAmt;
        }

        health -= damageAmt;
        if (health <= 0) {
            return true;
        }
        return false;
    }
}
