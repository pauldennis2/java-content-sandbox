import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Paul Dennis on 4/5/2017.
 */
public class StorageContainer {

    public static final int MAX_ITEMS = 5;

    private boolean isOpen;
    private boolean isLocked;
    private int combination;
    List<Object> contents;

    public StorageContainer () {
        isOpen = false;
        isLocked = false;
        contents = new ArrayList();
        Random random = new Random();
        combination = random.nextInt(9000) + 1000;
    }

    public boolean isOpen () {
        return isOpen;
    }

    public boolean isLocked () {
        return isLocked;
    }

    public void open () {
        if (!isLocked) {
            isOpen = true;
        } else {
            System.out.println("The box is locked.");
        }
    }

    public void close () {
        isOpen = false;
    }

    public void unlock (int combination) {
        if (this.combination == combination) {
            isLocked = false;
        }
    }

    public void lock () {
        if (!isOpen) {
            isLocked = true;
        } else {
            System.out.println("The box is open - it can't be locked.");
        }
    }

    public Object removeTopItem () {
        if (isOpen) {
            return contents.remove(0);
        } else {
            System.out.println("Box is not open.");
            return null;
        }
    }

    public void addItem (Object object) {
        if (isOpen) {
            if (contents.size() < MAX_ITEMS) {
                contents.add(0, object);
            } else {
                System.out.println("The box is full.");
            }
        } else {
            System.out.println("Box is not open.");
        }
    }
}
