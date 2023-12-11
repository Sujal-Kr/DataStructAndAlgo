package Vit.Dsa;

import java.util.*;

public class MyQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }
    public static void reverse(Queue<Integer> q) {

        Stack<Integer> stack1 = new Stack<>();

        while (!q.isEmpty()) {
            stack1.push(q.poll());
        }
        while (!stack1.isEmpty()) {
            q.add(stack1.pop());
        }

    }
}
