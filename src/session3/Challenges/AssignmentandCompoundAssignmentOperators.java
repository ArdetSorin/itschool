package session3.Challenges;
import java.util.Scanner;

public class AssignmentandCompoundAssignmentOperators {

    //1. Create a Java program that demonstrates the use of each compound assignment operator with integers.
    public static void main(String[] args) {
        int a = 13;
        int b = 7;

        a += b;
        System.out.println("+= Operator: x = " + a);

        a -= b;
        System.out.println("-= Operator: x = " + a);

        a *= b;
        System.out.println("*= Operator: x = " + a);

        a /= b;
        System.out.println("/= Operator: x = " + a);

        a %= b;
        System.out.println("%= Operator: x = " + a);

        //2. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        System.out.println("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = originalPrice * (discountPercentage / 100);
        originalPrice -= discountAmount;

        System.out.println("Price after discount: " + originalPrice);
    }
}