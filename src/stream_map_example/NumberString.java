package stream_map_example;

/**
 * Created by Paul Dennis on 4/10/2017.
 */
public class NumberString {

    private String value;
    String name;

    public NumberString (int num) {
        switch (num) {
            case 0:
                value = "Zero";
                break;
            case 1:
                value = "One";
                break;
            case 2:
                value = "Two";
                break;
            case 3:
                value = "Three";
                break;
            case 4:
                value = "Four";
                break;
            case 5:
                value = "Five";
                break;
            case 6:
                value = "Six";
                break;
            case 7:
                value = "Seven";
                break;
            case 8:
                value = "Eight";
                break;
            case 9:
                value = "Nine";
                break;
            case 10:
                value = "Ten";
                break;
            default:
                value = "More than ten";
                break;
        }
    }

    public String getValue () {
        return value;
    }
}
