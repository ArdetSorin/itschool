package session3.Challenges;

import java.util.Scanner;

public class IncrementandDecrementOperators {

    //1. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
    public static void main(String[] args) {
        System.out.println("Counting up to 10:");
        int x = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println("\nCounting down to 1:");
        x = 10;
        while (x >= 1) {
            System.out.print(x + " ");
            x--;
        }

        //2. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
        System.out.println("\nPlease enter your number:");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int incrementedNumber = number + 1;
        int decrementedNumber = number - 1;

        System.out.println("Starting number: " + number);
        System.out.println("Incremented number: " + incrementedNumber);
        System.out.println("Decremented number: " + decrementedNumber);
    }
}