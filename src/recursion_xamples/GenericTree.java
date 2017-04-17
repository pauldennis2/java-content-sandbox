package recursion_xamples;

import java.util.List;

/**
 * Created by Paul Dennis on 4/14/2017.
 */
public class GenericTree<T> {

    private T t;
    private List<GenericTree> children;


    public T getT() {
        return t;
    }

    public List<GenericTree> getChildren() {
        return children;
    }

    public GenericTree(T t, List<GenericTree> children) {
        this.t = t;
        this.children = children;
    }

    public boolean contains (T o) {
        if (this.t.equals(o)) {
            return true;
        }
        if (children != null) {
            for (GenericTree child : children) {
                if (child.contains(o)) {
                    return true;
                }
            }
        }
        return false;
    }
}
