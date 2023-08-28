package session3.challenges;

public class NumericPromotion {
    //1. Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).
    public static void main(String[] args) {
        int intValue = 15;
        double doubleValue = 4.3;

        double firstResult = intValue + doubleValue;
        double secondResult = intValue - doubleValue;
        double thirdResult = intValue * doubleValue;
        double forthResult = intValue / doubleValue;

        System.out.println("First result is: " + firstResult);
        System.out.println("Second result is: " + secondResult);
        System.out.println("Third result is: " + thirdResult);
        System.out.println("Forth result is: " + forthResult);

        //It is in that format because Java automatically promotes the integer value to a double before performing the operation, it is done to ensure that there is no loss of precision in the result and since double can represent a wider range of values and has a higher precision than int.

        //2. Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.
        byte byteValue1 = 127;
        byte byteValue2 = 22;

        // Adding two bytes and storing the result in a byte variable
        byte result = (byte) (byteValue1 + byteValue2);

        System.out.println("Result: " + result);
        //When we add 127 and 22 as bytes, they are promoted to int (127 + 22 = 149), and the result 149 is then cast back to a byte. A byte in Java can only store values from -128 to 127. Since 149 is outside this range, it overflows, and the result becomes -106.
    }
}