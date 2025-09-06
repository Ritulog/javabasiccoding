package objectOriProgra.classAndobjecy;

class Car {
    String color;          // Instance variable
    static int wheels = 4; // Static variable

    // Parameterized constructor
    Car(String color) {
        this.color = color;
    }

    void drive() {
        System.out.println(color + " car is driving");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return this.color.equals(((Car) obj).color);
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Red");
        Car c2 = new Car("Red");
        Car c3 = c1;
        Car c4 = null;

        //  Null reference trap
        // c4.drive(); //  NullPointerException

        //  == vs equals trap
        System.out.println(c1 == c2);       // false
        System.out.println(c1.equals(c2));  // true

        //  Static vs instance trap
        c1.wheels = 6;
        c1.color = "Blue";
        System.out.println(c2.wheels); // 6 (static shared)
        System.out.println(c2.color);  // Red (instance separate)

        //  Anonymous object trap
        new Car("Green").drive(); //  Works
        // new Car("Yellow").color = "Black"; //  Can't reuse

        //  Constructor trap
        // Car c5 = new Car(); //  Compile error: no default constructor

        // Local variable default trap
        int x;
        // System.out.println(x); //  Compile error: local variable not initialized

        //  Reference assignment trap
        System.out.println(c1 == c3); // true (same object)
    }
}
