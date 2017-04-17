package stream_example;

/**
 * Created by Paul Dennis on 4/10/2017.
 */
public class Animal {

    private String name;
    private String type;
    private int age;
    private boolean canFly;
    private boolean canSwim;

    public Animal(String name, String type, int age, boolean canFly, boolean canSwim) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.canFly = canFly;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public boolean canFly() {
        return canFly;
    }

    public boolean canSwim() {
        return canSwim;
    }
}
