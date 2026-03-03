package day05;

class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Student obj = new Student();
        obj.setName("Priya");
        obj.setAge(21);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
