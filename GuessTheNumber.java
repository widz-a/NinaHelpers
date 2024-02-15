import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        //Declare range that computah guess
        int min = 0;
        int max = 100;
        int attempts = 0;


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //This is the code to generate a random number from min to max!
            int guess = random.nextInt((max - min) + 1) + min;

            //Plus 1 attempt
            attempts++;

            //Self-explanatory!
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter:");
            System.out.println("1 if it's too high");
            System.out.println("2 if it's too low");
            System.out.println("3 if it's correct");

            //Get the response
            int rep = scanner.nextInt();

            //Close the range depends on if it's too low or too high (1 or 2)
            if (rep == 1) {
                max = guess - 1;
            } else if (rep == 2) {
                min = guess + 1;
            }

            //If it's correct (3), break the loop
            else if (rep == 3) {
                System.out.println("I guessed your number in " + attempts + " guesses!");
                break;
            }

            //If it's not 1 or 2 or 3, tell user invalid input
            else {
                System.out.println("Invalid response. Please enter 'h', 'l', or 'c'.");
            }

        }

        // Don't forget!
        scanner.close();
    }
}
