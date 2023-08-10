package session4.Challenges;

import java.util.ArrayList;

public class Challenge10 {

/*
10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding
a new element. Print both lists and observe the output.
 */

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo;

        listOne.add(1);
        listOne.add(2);
        listOne.add(3);

        listTwo = listOne;

        listOne.add(4);

        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);
    }
}