package day05;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.sound();
        obj.bark();
    }
}
