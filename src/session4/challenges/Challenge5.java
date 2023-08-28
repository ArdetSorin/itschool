package session4.challenges;

public class Challenge5 {

    /*
    5. Write a Java program to print the numbers from 1 to 10 using a for loop.
    As a next step, modify your program to print only the even numbers from 1 to 10.
     */
    public static void main(String[] args) {
        System.out.println("All numbers from 1 to 10:");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        System.out.println("\nEven numbers from 1 to 10:");
        for (int b = 2; b <= 10; b += 2) {
            System.out.println(b);
        }
    }
}