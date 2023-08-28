package session4.challenges;

public class Challenge2 {

/*
2. Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an
equality operator to compare these two numbers and print the result. Do the same for two String objects
firstString and secondString with the same value, but use the equals() method for comparison. Print the result.
 */

    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 7;

        if (firstNumber == secondNumber) {
            System.out.println("First number is higher then the second number. ");
        } else {
            System.out.println("Second number is lower then the first number. ");
        }

        String firstString = "Jupiter";
        String secondString = "Jupiter";

        if (firstString.equals(secondString)) {
            System.out.println("The Strings are equal.");
        } else {
            System.out.println("The Strings are not equal.");
        }
    }
}