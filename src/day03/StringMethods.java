package day03;

public class StringMethods {

    public static void main(String[] args) {

        String text = "Hello Priya";

        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(1));
        System.out.println(text.substring(0, 5));
        System.out.println(text.contains("Priya"));
        System.out.println(text.replace("Priya", "Java"));
        System.out.println(text.equals("Hello Priya"));
    }
}