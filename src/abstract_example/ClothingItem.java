package abstract_example;


import java.util.List;

public abstract class ClothingItem {

    private double weight;
    private boolean isRippedToShreds;

    public ClothingItem (double weight) {
        this.weight = weight;
        isRippedToShreds = false;
    }

    //Returns true if successful, otherwise false
    public abstract boolean putOn (List<BodyPart> bodyPartList);

    public void ripToShreds () {
        isRippedToShreds = true;
    }

    public void repair () {
        isRippedToShreds = false;
    }

    public double getWeight () {
        return weight;
    }
}
