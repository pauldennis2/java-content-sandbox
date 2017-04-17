package stream_example2;

public class Robot {

    private String name;
    private int liftCapacity;
    private int processingPower;
    private boolean isPrototype;
    private boolean isFunctional;

    public Robot(String name, int liftCapacity, int processingPower, boolean isPrototype, boolean isFunctional) {
        this.name = name;
        this.liftCapacity = liftCapacity;
        this.processingPower = processingPower;
        this.isPrototype = isPrototype;
        this.isFunctional = isFunctional;
    }

    public String getName () {
        return name;
    }

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public int getProcessingPower() {
        return processingPower;
    }

    public boolean isPrototype() {
        return isPrototype;
    }

    public boolean isFunctional() {
        return isFunctional;
    }
}
