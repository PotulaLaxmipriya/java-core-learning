package day08;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(3,"Java");
        map.put(1,"Python");
        map.put(2,"C++");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        map.remove(2);

        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
