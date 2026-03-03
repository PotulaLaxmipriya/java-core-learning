package day06;

public class ObjectClassMethods {

    int value;

    ObjectClassMethods(int value) {
        this.value = value;
    }

    public String toString() {
        return "Value: " + value;
    }

    public int hashCode() {
        return value * 10;
    }

    public boolean equals(Object obj) {
        ObjectClassMethods other = (ObjectClassMethods) obj;
        return this.value == other.value;
    }

    public static void main(String[] args) {

        ObjectClassMethods obj1 = new ObjectClassMethods(10);
        ObjectClassMethods obj2 = new ObjectClassMethods(10);

        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        System.out.println(obj1.equals(obj2));
    }
}
