package day06;

class Parent {
    int x = 50;

    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int x = 100;

    void show() {
        System.out.println(super.x);
        super.display();
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
    }
}