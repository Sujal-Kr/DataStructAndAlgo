package Vit.Java.CollectionFramework;
import java.util.*;
public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(22);
        stack.push(56);
        stack.push(1001);
        System.out.println(stack.search(34));
        System.out.println(stack.indexOf(34));
        System.out.println(stack);
        
    }
}
