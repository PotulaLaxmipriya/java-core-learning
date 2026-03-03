package day04;

public class MethodExample {

    void greet() {
        System.out.println("Hello Priya");
    }

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodExample obj = new MethodExample();

        obj.greet();

        int result = obj.add(10, 20);
        System.out.println(result);
    }
}
