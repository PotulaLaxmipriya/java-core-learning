package day08;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");

        System.out.println(map.get(2));

        map.remove(3);

        System.out.println(map.containsKey(1));

        System.out.println(map.size());

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        map.clear();
    }
}
