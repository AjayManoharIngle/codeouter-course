package control_statement;

import java.util.Scanner;

public class Exercise10_DoWhileLoop {

	public static void main(String[] args) {
		
		// Guess Number program.
		// Take number from user to guess secret number from 1 to 10
		// if unable to guess number then give chances till guess number correctly.
		
		int secretNumber = 9; // declare random number between 1 and 10
        int userGuess;
        boolean guessedCorrectly = false;

        System.out.println("Guess the secret number between 1 and 10:");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number.");
            } else {
                System.out.println("Try again! That's not the correct number.");
            }

        } while (!guessedCorrectly);

        scanner.close();
	}
}
