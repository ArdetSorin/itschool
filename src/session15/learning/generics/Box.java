package session15.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Box<String> stringBox = new Box<>();
        stringBox.setObj("Hello world!");

        System.out.println(stringBox.getObj());

        Integer[] integers = {1, 2, 5};
        String[] strings = {"Cluj", "Bucuresti", "Iasi"};

        printArray(integers);
        printArray(strings);
    }

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
    }
}