package session3.Learning;

import java.util.Scanner;

public class ScannerClass {

    //psvm shortcut
    public static void main(String[] args) {
        //sout shortcut
        System.out.println();

        String userName = "Sorin";
        int userAge = 30;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide some text:");
        String userInput = scanner.nextLine();
        System.out.printf("Your input is: " + userInput);

        scanner.close();
    }
}
