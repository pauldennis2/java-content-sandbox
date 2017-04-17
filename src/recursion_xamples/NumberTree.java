package recursion_xamples;

import java.util.List;

/**
 * Created by Paul Dennis on 4/13/2017.
 */
public class NumberTree {

    private Integer value;
    private List<NumberTree> children;

    public NumberTree (Integer value, List<NumberTree> children) {
        this.value = value;
        this.children = children;
    }

    public Integer getValue() {
        return value;
    }

    public List<NumberTree> getChildren() {
        return children;
    }
}
