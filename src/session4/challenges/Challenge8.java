package session4.challenges;

import java.util.Scanner;

public class Challenge8 {

/*
8.Write a Java program to calculate the factorial of a number using a for a loop.
Declare an integer variable number and assign a value to it. Then calculate and print
the factorial of number.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
            scanner.close();
        }
    }
}