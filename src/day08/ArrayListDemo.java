package day08;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add(1, "JavaScript");

        System.out.println(list.get(2));

        list.set(0, "Core Java");

        System.out.println(list.contains("Python"));

        list.remove("C++");

        System.out.println(list.size());

        for(String s : list){
            System.out.println(s);
        }

        list.clear();
    }
}
