package abstract_example;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public abstract class BodyPart {
    private String ownerName;

    public BodyPart (String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName () {
        return ownerName;
    }
}
