package day08;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        System.out.println(stack.search(10));

        System.out.println(stack.size());

        for(Integer n : stack){
            System.out.println(n);
        }

        stack.clear();
    }
}