package day05;

interface MyInterface {
    void show();
}

class Demo implements MyInterface {
    public void show() {
        System.out.println("Working fine");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}
