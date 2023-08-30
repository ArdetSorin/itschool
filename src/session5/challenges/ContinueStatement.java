package session5.challenges;

import java.util.Scanner;

public class ContinueStatement {

    /*
    12. Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
    If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter 10 numbers");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number <= 5) {
                continue;
            }

            sum += number;
        }

        System.out.println("Sum of numbers greater than 5: " + sum);

        scanner.close();
    }
}