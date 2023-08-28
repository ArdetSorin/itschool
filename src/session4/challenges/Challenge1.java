package session4.challenges;

public class Challenge1 {

/*
1. Write a Java program where you create two String objects named StringOne and stringTwo
with the same value "OpenAI".Check and print whether they refer to the same object.
 */

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        System.out.println("If using == the result will be: " + (stringOne == stringTwo));
        System.out.println("If using .equal() the result will be: " + stringOne.equals(stringTwo));
    }
}