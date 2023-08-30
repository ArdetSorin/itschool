package session5.challenges;

import java.util.Scanner;

public class CountingNegativeNumbers {

    /*
    3. Given an array of integers, write a program to count and print the number of negative
    integers in the array.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int number = scanner.nextInt();

        int[] array = new int[number];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < number; i++) {
            System.out.println("Give the element" + " " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int negativeCount = 0;

        for (int num : array) {
            if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("The number of the negative element is: " + negativeCount);

        scanner.close();
    }
}