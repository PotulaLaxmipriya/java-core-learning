package day08;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("C++");

        vector.add(1,"JavaScript");

        System.out.println(vector.get(2));

        vector.set(0,"Core Java");

        System.out.println(vector.contains("Python"));

        vector.remove("C++");

        System.out.println(vector.size());

        for(String s : vector){
            System.out.println(s);
        }

        vector.clear();
    }
}
