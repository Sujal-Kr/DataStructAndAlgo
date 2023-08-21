package LeetCode;
import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args) {
        int arr[]={89,62,70,58,47,47,46,76,100,70};
        // 8,1,5,4,3,2,1,1,0,0
        for(int item:solution(arr)){
            System.out.print(item+" ");
        }
    }

    private static int[] solution(int[] arr) {
            int res[]=new int[arr.length];
            
            Stack<Integer> stack=new Stack<Integer>();
            stack.push(arr.length-1);
            res[arr.length-1]=0;
            for(int i=arr.length-2; i>=0; i--){
                while(!stack.isEmpty()&&arr[i]>=arr[stack.peek()]) stack.pop();
                if(!stack.isEmpty())res[i]=stack.peek()-i;
                else res[i]=0;
                stack.push(i);
            }
            return res;
    }
}
