// Austin Wiant - Assignment 2.2 - CSD-402 - 3/30/2025

// import Random class for random numbers
import java.util.Random;

// import Scanner class for user input
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"}; // array to store choices
        Scanner scanner = new Scanner(System.in); // Scanner object for input
        Random random = new Random(); // Create random object for generating computer's choices

        // prompt user to enter choice
        System.out.println("Enter your choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
        int userChoice = scanner.nextInt() - 1;

        // check if user choice is valid
        if (userChoice < 0 || userChoice >= choices.length) {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        } else {
            int computerChoice = random.nextInt(3);
            
            // display the user and computer choices
            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // give results
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        scanner.close();
    }
}
