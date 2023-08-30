package session5.challenges;

import java.util.Scanner;

public class BreakStatement {

    /*
    11. Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
    If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of entered numbers: " + average);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}