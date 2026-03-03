package day03;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Welcome");

        sb.append(" Priya");
        sb.insert(7, " Java");
        sb.replace(0, 7, "Hi");
        sb.delete(2, 6);
        sb.reverse();

        System.out.println(sb);
    }
}
