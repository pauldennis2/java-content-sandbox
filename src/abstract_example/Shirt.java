package abstract_example;

import java.util.List;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class Shirt extends ClothingItem {

    public Shirt (double weight) {
        super (weight);
    }

    public boolean putOn (List<BodyPart> bodyPartList) {
        //We will put on a shirt if we're given two arms from the same owner
        if (bodyPartList.size() != 2) {
            return false;
        }
        if (!(bodyPartList.get(0).getOwnerName().equals(bodyPartList.get(1).getOwnerName()))) {
            return false;
        }
        if (!(bodyPartList.get(0) instanceof Arm)) {
            return false;
        }
        if (!(bodyPartList.get(1) instanceof Arm)) {
            return false;
        }
        return true;
    }
}
