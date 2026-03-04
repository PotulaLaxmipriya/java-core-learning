package day08;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Apple");

        System.out.println(set.contains("Mango"));

        set.remove("Banana");

        System.out.println(set.size());

        for(String s : set){
            System.out.println(s);
        }

        set.clear();
    }
}
