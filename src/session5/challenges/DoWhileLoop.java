package session5.challenges;

import java.util.Scanner;

public class DoWhileLoop {

    /*
    7. Create a program where the user is prompted to guess a predefined number. After each guess,
    the program should inform the user if the guess is too high or too low. The program should keep prompting
    the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int predefinedNumber = 27;
        int userGuess;

        System.out.println("Guess a number between 1 and 50.");
        do {
            System.out.print("Guess the number: ");
            userGuess = scanner.nextInt();

            if (userGuess > predefinedNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < predefinedNumber) {
                System.out.println("Too low! Try again.");
            }
        } while (userGuess != predefinedNumber);

        System.out.println("Congratulations! You guessed the number.");

        scanner.close();
    }
}