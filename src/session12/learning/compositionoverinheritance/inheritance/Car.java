package session12.learning.compositionoverinheritance.inheritance;

public class Car extends Engine {

    @Override
    void start() {
        System.out.println("Car is moving");
    }
}