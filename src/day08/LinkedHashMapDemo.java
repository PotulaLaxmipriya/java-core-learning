package day08;


import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");

        System.out.println(map.get(2));

        map.put(2,"JavaScript");

        map.remove(3);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Python"));

        System.out.println(map.size());

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        map.clear();
    }
}