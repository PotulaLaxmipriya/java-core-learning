package day08;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3,"A"));
        list.add(new Student(1,"B"));
        list.add(new Student(2,"C"));

        Collections.sort(list,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s1.id-s2.id;
            }
        });

        for(Student s:list){
            System.out.println(s.id+" "+s.name);
        }
    }
}
