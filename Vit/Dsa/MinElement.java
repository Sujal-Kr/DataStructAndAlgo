package Vit.Dsa;
import java.util.*;
public class MinElement{
    public static void main(String[] args) {
        int arr[]={3,6,1,7,3,10,9};
        Stack<Integer> stack=new Stack<>();
        for(int item:arr){
            stack.push(item);
        }
        System.out.println(stack);
        int ans=solution(stack);
        System.out.println(stack);
        System.out.println(ans);
    }

    private static int solution(Stack<Integer> stack) {
        int min=Integer.MAX_VALUE;
        Stack<Integer> temp=new Stack<>();
        while(!stack.isEmpty()) {
            int item=stack.pop();
            // find the smallest element in the stack
            min=Math.min(min,item);
            // store the element in the other stack
            temp.push(item);
        }
        // obtain the actual order of the elements.
        while(!temp.isEmpty()) {
            int item=temp.pop();
            if(item!=min)stack.push(item);
        }
        stack.push(min);
        return stack.peek();
    
    }
}