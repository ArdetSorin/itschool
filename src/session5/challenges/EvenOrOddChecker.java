package session5.challenges;

import java.util.Scanner;

public class EvenOrOddChecker {
    /*
    1. Write a Java program that takes an integer as input. If the number is even, print "Even".
    If it's odd, print "Odd".
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}