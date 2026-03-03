package day04;

public class ThisKeywordDemo {

    String name;
    int age;

    ThisKeywordDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        ThisKeywordDemo obj = new ThisKeywordDemo("Priya", 21);
        obj.display();
    }
}
