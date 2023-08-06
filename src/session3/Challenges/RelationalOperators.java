package session3.Challenges;
import java.util.Scanner;

public class RelationalOperators {
    //1. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        boolean greaterThan = a > b;
        boolean lessThan = a < b;
        boolean equalTo = a == b;

        System.out.println(a + " is greater than " + b + ": " + greaterThan);
        System.out.println(a + " is less than " + b + ": " + lessThan);
        System.out.println(a + " is equal to " + b + ": " + equalTo);

        //2. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use rational operators for the checks.
        int lowerNumber = 1;
        int upperNumber = 100;

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean range = (number >= lowerNumber) && (number <= upperNumber);

        if (range) {
            System.out.println(number + " is within the range " + lowerNumber + " - " + upperNumber);
        } else {
            System.out.println(number + " is outside the range " + lowerNumber + " - " + upperNumber);
        }
    }
}