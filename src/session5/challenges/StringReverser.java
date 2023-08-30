package session5.challenges;

import java.util.Scanner;

public class StringReverser {

    /*
    4. Ask the user to enter a string. Print the reversed version of this string.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}