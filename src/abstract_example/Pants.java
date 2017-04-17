package abstract_example;

import java.util.List;

/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class Pants extends ClothingItem {

    public Pants (double weight) {
        super(weight);
    }

    public boolean putOn (List<BodyPart> bodyPartList) {
        //We will put on pants if we're given two legs from the same owner
        if (bodyPartList.size() != 2) {
            return false;
        }
        if (!(bodyPartList.get(0).getOwnerName().equals(bodyPartList.get(1).getOwnerName()))) {
            return false;
        }
        if (!(bodyPartList.get(0) instanceof Leg)) {
            return false;
        }
        if (!(bodyPartList.get(1) instanceof Leg)) {
            return false;
        }
        return true;
    }
}
