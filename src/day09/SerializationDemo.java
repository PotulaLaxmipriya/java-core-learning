package day09;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(101,"Priya");

        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.close();

        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s.id + " " + s.name);

        ois.close();
    }
}
