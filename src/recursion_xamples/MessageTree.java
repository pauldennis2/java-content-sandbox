package recursion_xamples;

import java.util.List;

/**
 * Created by Paul Dennis on 4/13/2017.
 */
public class MessageTree {

    private String message;
    private List<MessageTree> children;

    public MessageTree (String message, List<MessageTree> children) {
        this.message = message;
        this.children = children;
    }

    public String getMessage() {
        return message;
    }

    public List<MessageTree> getChildren() {
        return children;
    }

    public boolean contains (String message) {
        if (this.message.equals(message)) {
            return true;
        }
        if (children != null) {
            for (MessageTree child : children) {
                if (child.contains(message)) {
                    return true;
                }
            }
        }
        return false;
    }
}
