package session8.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LInkedListPractice {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eva");
        names.add(2, "Frank");

        System.out.println(names);
    }
}
