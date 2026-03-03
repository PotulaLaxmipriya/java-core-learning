package day06;

class Demo {

    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30;
    private int privateVar = 40;

    public void show() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}

public class AccessModifiersDemo {

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.show();
    }
}
