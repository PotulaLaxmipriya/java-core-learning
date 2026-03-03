package day06;

final class FinalClass {
    void display() {
        System.out.println("Final class method");
    }
}

public class FinalKeywordDemo {

    final int value = 100;

    final void show() {
        System.out.println("Final method");
    }

    public static void main(String[] args) {

        FinalKeywordDemo obj = new FinalKeywordDemo();
        System.out.println(obj.value);
        obj.show();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}
