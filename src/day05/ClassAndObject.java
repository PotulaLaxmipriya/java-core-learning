package day05;

public class ClassAndObject {

    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        ClassAndObject obj = new ClassAndObject();
        obj.name = "Priya";
        obj.age = 21;

        obj.display();
    }
}
