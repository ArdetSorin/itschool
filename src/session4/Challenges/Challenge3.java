package session4.Challenges;

public class Challenge3 {
/*
3. Write a Java program that declares an integer variable age with a value of 20. Print a statement saying
"I am adult" if age is 18 or more, else print "I am not an adult".
 */

    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("I am adult");
        } else {
            System.out.println("I am not an adult");
        }
    }
}