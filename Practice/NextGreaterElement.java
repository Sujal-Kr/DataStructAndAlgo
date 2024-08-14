package Practice;
import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        long arr[]={6 ,8 ,0 ,1 ,3};
        System.out.println(solution(arr));
    }

    private static long[] solution(long[] arr) {
        long[] res = new long[arr.length];
        Stack<Long> stack=new Stack<>();
        stack.push(arr[arr.length - 1]);
        res[arr.length - 1] =-1;
        for(int i=arr.length - 2; i>=0; i--){
            while(!stack.isEmpty()&&stack.peek()>=arr[i])stack.pop();
            if(stack.isEmpty())res[i]=-1;
            else res[i]=stack.peek();
            stack.push(arr[i]);
        }

        return null;
    }
}
