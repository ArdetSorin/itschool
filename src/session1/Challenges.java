package session1;

import java.util.Scanner;

public class Challenges {
    public static void main(String[] args) {

        //1
        String myName = "Sorin";
        int myAge = 30;
        String favoriteColor = "Blue";

        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(favoriteColor);

        //2
        int randomNumber = 21;
        double randomDoubleNumber = 21.5;
        char randomChar = 'S';
        String randomString = "orin";

        System.out.println(randomNumber + " " + randomDoubleNumber + " " + randomChar + randomString);

        //3
        int a = 21;
        int b = 13;
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        float div = (float) a / b;
        int mod = a % b;
        System.out.println("The sum of " + a + "+" + b + " " + "=" + " " + sum);
        System.out.println("The subtraction of " + a + "-" + b + " " + "=" + " " + sub);
        System.out.println("The multiplication of " + a + "*" + b + " " + "=" + " " + mult);
        System.out.println("The division of " + a + "/" + b + " " + "=" + " " + div);
        System.out.println("The modulus of " + a + "%" + b + " " + "=" + " " + mod);

        //4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        System.out.println("The sum of the two number is " + (firstNumber + secondNumber));

    }
}
