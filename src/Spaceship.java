/**
 * Created by Paul Dennis on 4/6/2017.
 */
public class Spaceship {

    protected int health;

    public Spaceship (int health) {
        this.health = health;
    }

    public boolean takeDamage (int damageAmt) {
        health -= damageAmt;
        if (health <= 0) {
            return true;
        }
        return false;
    }
}
