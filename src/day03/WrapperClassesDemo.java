package day03;

public class WrapperClassesDemo {

    public static void main(String[] args) {

        int a = 10;
        Integer obj = Integer.valueOf(a);

        String numStr = "100";
        int number = Integer.parseInt(numStr);

        Double d = Double.valueOf(99.99);

        System.out.println(obj);
        System.out.println(number);
        System.out.println(d);
    }
}
