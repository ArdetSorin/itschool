package session3.challenges;

import java.util.Scanner;

public class LogicalComplementandNegationOperators {

    //1. Write a program to check if a number is positive or negative using logical complement operator.
    public static void main(String[] args) {
        int number = -99 * (13 / 4);
        checkNumber(number);
    }

    public static void checkNumber(int number) {
        boolean isPositive = number >= 0;
        boolean isNegative = !isPositive;
        if (isPositive) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println(number + " is a negative number");
        }
        //2. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your favorite color is blue (true or false)?");
        boolean a = scanner.nextBoolean();
        System.out.println("Your favorite color is red (true or false)?");
        boolean b = scanner.nextBoolean();

        boolean firstResult = !a;
        boolean secondResult = !b;

        System.out.println("Negation of the first result is: " + firstResult);
        System.out.println("Negation of the second result is: " + secondResult);
    }
}