package session5.challenges;

import java.util.Scanner;

public class WhileLoop {

    /*
    6. Write a program that asks the user to enter numbers. The program should continue prompting
    the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (enter -1 to calculate the sum): ");
            number = scanner.nextInt();

            if (number != -1) {
                sum += number;
            }
        } while (number != -1);

        System.out.println("Sum of entered numbers: " + sum);

        scanner.close();
    }
}