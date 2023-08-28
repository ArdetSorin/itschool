package session3.challenges;

public class UnaryOperators {

    //1. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
    public static void main(String[] args) {
        double variable = 33.3;
        variable++;
        System.out.println("After increment: " + variable);
        variable--;
        System.out.println("After decrement: " + variable);

        //2. Write a program that reverses the sign of an entered integer using unary minus operator.
        int number = 55;
        number = -number;

        System.out.println("The reversed sing of the integer is: " + number);
    }
}