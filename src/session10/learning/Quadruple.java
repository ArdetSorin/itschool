package session10.learning;

public class Quadruple {

    private String name;

    public Quadruple(String name) {
        this.name = name;
        System.out.println("Constructor from Animal class was called");
    }
}

class Dog extends Quadruple {

    public Dog(String name) {
        super(name);
        System.out.println("Constructor from Dog class was called");
    }
}
