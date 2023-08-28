package session4.challenges;

public class Challenge4 {

/* Write a Java program where you declare two integer variables heightOne and heightTwo
with any value. Use a ternary operator to determine the greater height and assign it to
a variable maximumHeight. Print the result.
 */

    public static void main(String[] args) {
        int heightOne = 178;
        int heightTwo = 173;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("The maximum height is: " + maximumHeight);
    }
}