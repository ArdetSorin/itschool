package session4.challenges;

public class Challenge7 {

/*
7. Write a Java program that determines the type of triangle based on its sides.
Declare three variable sideOne, sideTwo and sideThree to represent the sides of the
triangle. Use the ternary operator to determine and print whether the triangle is
"Equilateral", "Isosceles", or "Scalene".
 */

    public static void main(String[] args) {
        int sideOne = 11;
        int sideTwo = 3;
        int sideThree = 11;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree)
                ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree)
                ? "Isosceles"
                : "Scalene";

        System.out.println("The triangle is: " + triangleType);
    }

}