package session13;

public class StringReversal {

    public static void main(String[] args) {
        String myInput = "Hello";

        System.out.println("Reversed string: " + reversedString(myInput));
    }

    public static String reversedString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}