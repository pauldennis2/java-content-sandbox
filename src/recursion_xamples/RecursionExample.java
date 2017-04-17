package recursion_xamples;

import java.util.ArrayList;
import java.util.List;

public class RecursionExample {

    public static void main(String[] args) {
        MessageTree root = buildTree();
        System.out.println(searchTree("3c of 3c", root));
        System.out.println(searchTree("1c", root));
        System.out.println(searchTree("Foo", root));
    }

    public static boolean searchTree (String message, MessageTree root) {
        if (root.getMessage().equals(message)) {
            return true;
        }
        if (root.getChildren() != null) {
            for (MessageTree child : root.getChildren()) {
                if (child.getMessage().equals(message)) {
                    return true;
                }
            }
            for (MessageTree child : root.getChildren()) {
                if (searchTree(message, child)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void betterSearch (String message, MessageTree root) {
        System.out.println("Looking for message *" + message + "*");
        if (root.contains(message)) {
            System.out.println("It's in there somewhere");
        } else {
            System.out.println("Nope.");
        }
    }


    public static MessageTree buildTree () {
        List<MessageTree> firstGroup = new ArrayList<>();
        firstGroup.add(new MessageTree("1c of 1c", null));
        firstGroup.add(new MessageTree("2c of 1c", null));
        firstGroup.add(new MessageTree("3c of 1c", null));

        List<MessageTree> secondGroup = new ArrayList<>();
        secondGroup.add(new MessageTree("1c of 2c", null));
        secondGroup.add(new MessageTree("2c of 2c", null));

        List<MessageTree> thirdGroup = new ArrayList<>();
        thirdGroup.add(new MessageTree("1c of 3c", null));
        thirdGroup.add(new MessageTree("2c of 3c", null));
        thirdGroup.add(new MessageTree("3c of 3c", null));

        List<MessageTree> mainGroup = new ArrayList<>();
        mainGroup.add(new MessageTree("1c", firstGroup));
        mainGroup.add(new MessageTree("2c", secondGroup));
        mainGroup.add(new MessageTree("3c", thirdGroup));

        return new MessageTree("Root", mainGroup);
    }
}
