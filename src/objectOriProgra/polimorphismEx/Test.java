package objectOriProgra.polimorphismEx;

class Parent {
    Parent() {
        System.out.println("Parent constructor");
        print();  // Polymorphic call inside constructor
    }
    void print() { System.out.println("Parent print"); }
}

class Child extends Parent {
    int x = 10;

    Child() {
        System.out.println("Child constructor");
    }

    @Override
    void print() { System.out.println("Child print, x = " + x); }
}

public class Test {
    public static void main(String[] args) {
        new Child();
    }
}
