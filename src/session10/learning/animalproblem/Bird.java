package session10.learning.animalproblem;

public class Bird extends  Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The bird is eating seeds and insects");
    }
}
