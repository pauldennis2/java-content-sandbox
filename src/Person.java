/**
 * Created by Paul Dennis on 4/7/2017.
 */
public class Person {

    String name;

    public Person (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return "I'm a person and my name is " + name;
    }
    /*
    @Override
    public boolean equals (Object o) {
        try {
            Person otherPerson = (Person)o;
            if ()
        } catch (ClassCastException ex) {
            return false;
        }
    }*/

}
