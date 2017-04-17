import java.util.Random;
import java.util.Scanner;

/**
 * Created by Paul Dennis on 4/5/2017.
 */
public class NumberGuessingRefactor {

    public static void main (String[] args) {
        //Number guessing game
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have three guesses to guess the number.");
        System.out.println("I will tell you \"higher\" or \"lower\" each guess.");
        Scanner userInputScanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(11);
        int guessesRemaining = 3;
        while (guessesRemaining > 0) {
            int guess = getGuess(userInputScanner);

            if (evaluateGuess(secretNumber, guess)) break;

            guessesRemaining--;
        }
        System.out.println("The secret number was " + secretNumber);
    }

    private static int getGuess(Scanner userInputScanner) {
        System.out.println("Please input your guess.");
        System.out.println("Number must be between 0 and 10 (inclusive)");
        return userInputScanner.nextInt();
    }

    private static boolean evaluateGuess(int secretNumber, int guess) {
        if (guess > 10) {
            System.out.println("Guess was too large");
        } else if (guess < 0) {
            System.out.println("Guess was too small");
        } else if (guess == secretNumber) {
            System.out.println("You got it!");
            return true;
        } else if (guess > secretNumber) {
            System.out.println("Too high.");
        } else if (guess < secretNumber) {
            System.out.println("Too low");
        } else {
            System.out.println("Not sure???");
        }
        return false;
    }
}
