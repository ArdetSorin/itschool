package session3.Challenges;

public class BynaryArithmeticOperators {

    //1. Write a Java program to take two numbers as input and display the result of addition, subtraction multiplication, division and modulus.
    public static void main(String[] args) {
        int a = 21;
        double b = 3.3;
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        double reminder = a % b;

        System.out.println("The sum of: " + a + "+" + b + "=" + sum);
        System.out.println("The difference of: " + a + "-" + b + "=" + difference);
        System.out.println("The product of: " + a + "*" + b + "=" + product);
        System.out.println("The quotient of: " + a + "/" + b + "=" + quotient);
        System.out.println("The reminder of: " + a + "%" + b + "=" + reminder);

        //2. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        int length = 13;
        double breadth = 12.5;
        double area = length * breadth;

        System.out.println("The area of the rectangle is " + area);
    }
}