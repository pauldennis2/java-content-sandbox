package stream_example;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Animal> animalList = initializeList();

        System.out.println("Animals that can fly:");
        animalList.stream()
                .filter(e -> e.canFly())
                .forEach(e -> System.out.println("\t" + e.getName()));

        System.out.println("Animals with two names:");
        animalList.stream()
                .filter(e -> e.getName().contains(" "))
                .forEach(e -> System.out.println("\t" + e.getName()));

        System.out.println("Elephants:");
        animalList.stream()
                .filter(e -> e.getType().equals("Elephant"))
                .forEach(e -> System.out.println("\t" + e.getName()));

        System.out.println("Animals that can't swim OR fly:");
        animalList.stream()
                .filter(e -> !e.canFly())
                .filter(e -> !e.canSwim())
                .forEach(e -> System.out.println("\t" + e.getName()));

        System.out.println("Animals whose name matches their type:");
        animalList.stream()
                .filter(e -> e.getName().equals(e.getType()))
                .forEach(e -> System.out.println("\t" + e.getName()));

        int totalAgeOfSwimmers = animalList.stream()
                .filter(e -> e.canSwim())
                .mapToInt(e -> e.getAge())
                .sum();
        System.out.println("Total age of swimmers = " + totalAgeOfSwimmers);

    }

    public static List<Animal> initializeList () {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Babar", "Elephant", 10, false, false));
        animalList.add(new Animal("Argulor", "Eagle", 2, true, false));
        animalList.add(new Animal("Baldy", "Eagle", 20, false, false));
        animalList.add(new Animal("Tommy", "Dolphin", 9, false, true));
        animalList.add(new Animal("Sol", "Sea Turtle", 125, false, true));
        animalList.add(new Animal("Dumbo", "Elephant", 3, true, false));
        animalList.add(new Animal("Gurgl", "Flying Fish", 1, true, true));
        animalList.add(new Animal("Curious George", "Monkey", 5, false, false));
        animalList.add(new Animal("Cowardly Lion", "Lion", 12, false, false));
        animalList.add(new Animal("Robin", "Robin", 2, true, false));
        animalList.add(new Animal("Spiky", "Sea Urchin", 45, false, true));
        animalList.add(new Animal("Arbez", "Zebra", 5, false, false));
        animalList.add(new Animal("Pegasus", "Pegasus", 1000, true, false));
        return animalList;
    }
}
