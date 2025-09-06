package objectOriProgra;

class Car {
    static int wheels = 4;
    int doors = 2;
    void drive() {
        System.out.println("Driving");
    }

}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        new Car().doors = 10;
        new Car().drive();
        c1.wheels = 6;
        c1.doors = 3;



        System.out.println(c2.wheels); // 6 
        System.out.println(c2.doors);  // 2
    }}