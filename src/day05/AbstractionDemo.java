package day05;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Vehicle obj = new Car();
        obj.start();
        obj.stop();
    }
}
