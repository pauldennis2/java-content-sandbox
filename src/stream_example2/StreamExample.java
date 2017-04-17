package stream_example2;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Robot> robots = makeRobots();
        int total = 0;
        //Defunct prototypes
        System.out.println("Defunct prototypes:");
        robots.stream()
                .filter(e -> !e.isFunctional())
                .filter(e -> e.isPrototype())
                .forEach(e -> System.out.println("\t" + e.getName()));

        System.out.println("Total lift capacity of functional bots:");
        total = robots.stream()
                .filter(e -> e.isFunctional())
                .mapToInt(e -> e.getLiftCapacity())
                .sum();
        System.out.println(total);

        System.out.println("Total lift capacity of non-functional bots:");
        total = robots.stream()
                .filter(e -> !e.isFunctional())
                .mapToInt(e -> e.getLiftCapacity())
                .sum();
        System.out.println(total);

        System.out.println("Total lift capacity of all bots");
        total = robots.stream()
                .mapToInt(e -> e.getLiftCapacity())
                .sum();
        System.out.println(total);

        System.out.println("Strong dumb robots:");
        robots.stream()
                .filter(e -> e.getLiftCapacity() > e.getProcessingPower())
                .forEach(e -> System.out.println("\t" + e.getName()));

        System.out.println("Weak smart robots:");
        robots.stream()
                .filter(e -> e.getLiftCapacity() < e.getProcessingPower())
                .forEach(e -> System.out.println("\t" + e.getName()));

    }

    public static List<Robot> makeRobots () {
        List<Robot> robots = new ArrayList<>();
        robots.add(new Robot("BobBot", 10, 500, false, true));
        robots.add(new Robot("SallyBot", 20, 400, true, true));
        robots.add(new Robot("TommyBot", 5, 1000, true, false));
        robots.add(new Robot("MarkBot", 500, 10, false, true));
        robots.add(new Robot("CathyBot", 25, 10, false, false));
        robots.add(new Robot("JamesBot", 1, 950, false, true));
        robots.add(new Robot("AmazeBot", 800, 1250, true, true));
        robots.add(new Robot("LameBot", 1, 5, false, true));
        robots.add(new Robot("JohnBot", 20, 20, false, false));
        robots.add(new Robot("LiftBot", 90, 50, true, false));
        return robots;
    }
}
