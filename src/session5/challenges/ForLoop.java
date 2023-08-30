package session5.challenges;

public class ForLoop {

    /*
    8. Write a program that prints the first 10 numbers in the Fibonacci series.
    Use a for loop to accomplish this.
     */

    public static void main(String[] args) {
        int n = 10;

        int fib1 = 0;
        int fib2 = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fib1 + " ");

            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
    }
}