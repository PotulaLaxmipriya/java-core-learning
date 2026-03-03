package day04;

public class ConstructorExample {

    String name;
    int age;

    ConstructorExample(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {

        ConstructorExample obj = new ConstructorExample("Priya", 21);

        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
