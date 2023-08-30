package session5.challenges;

public class ForEachLoop {

    /*
    9. Given an array of integers, write a program that prints each number in the array followed
    by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.
     */

    public static void main(String[] args) {
        int[] numbers = {2, 10, 5, 7, 8, 1, 4, 9, 6};

        System.out.println("Number of array:");

        for (int number : numbers) {
            System.out.print("Number " + number + " is ");
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}