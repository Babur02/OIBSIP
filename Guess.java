
//Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class Guess {

	public static void main(String args[]) {
		generateRandom();
	} // end main method

	public static void generateRandom() {
		// Creating object of Random Class
		Random rand = new Random();

		// Generating a random number between 0-100
		int randomNum = rand.nextInt(101);

		// Calling guess method
		guess(randomNum);
	}// end generateRandom method

	public static void guess(int randomNum) {
		// creating an object of Scanner Class
		Scanner sc = new Scanner(System.in);
		int nguesses = 1;
		int guess;
		// Welcome Message

		do {
			System.out.println("");
			System.out.println("Number Guessing Game");
			System.out.print("Guess a number between 0-100: ");
			guess = sc.nextInt();
			System.out.println("");
			while (guess < 0 || guess > 100) {
				System.out.print("Please enter no between 1 to 100:");
				guess = sc.nextInt();
			}

			if (guess > randomNum) {
				System.out.println("Lower no please!");

			} else if (guess < randomNum) {
				System.out.println("Higher no please!");

			} else if (guess == randomNum) {
				// Game Won
				System.out.println("Correct Answer. You Won!");
				System.out.println("you guessed it in " + nguesses + " attempts");
			}
			nguesses++;
		} while (guess != randomNum);

		// Play again or exit?
		System.out.println("Press 1 to Play again.");
		System.out.println("Press 0 to exit.");
		int choice = sc.nextInt();

		if (choice == 1)
			generateRandom();
		else
			return;
	}// end guess method

}// end class
