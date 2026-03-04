package day08;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.peek());

        pq.poll();

        for(Integer n : pq){
            System.out.println(n);
        }
    }
}
