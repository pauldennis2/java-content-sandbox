package recursion_xamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Dennis on 4/13/2017.
 */
public class RecursionExample2 {

    public static void main(String[] args) {
        NumberTree root = buildTree();
    }

    public static NumberTree buildTree () {
        List<NumberTree> firstGroup = new ArrayList<>();
        firstGroup.add(new NumberTree(5, null));
        firstGroup.add(new NumberTree(2, null));
        firstGroup.add(new NumberTree(0, null));

        List<NumberTree> secondGroup = new ArrayList<>();
        secondGroup.add(new NumberTree(-1, null));
        secondGroup.add(new NumberTree(-9, null));

        List<NumberTree> thirdGroup = new ArrayList<>();
        thirdGroup.add(new NumberTree(5, null));
        thirdGroup.add(new NumberTree(50000, null));
        thirdGroup.add(new NumberTree(-20, null));

        List<NumberTree> mainGroup = new ArrayList<>();
        mainGroup.add(new NumberTree(100, firstGroup));
        mainGroup.add(new NumberTree(90, secondGroup));
        mainGroup.add(new NumberTree(20, thirdGroup));

        return new NumberTree(0, mainGroup);
    }

}
