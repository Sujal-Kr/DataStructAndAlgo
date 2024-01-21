package GeeksForGeeks;
import java.util.*;
public class HelpClassmates {
    public static void main(String[] args) {
        int arr[]={3, 8, 5, 2, 25};
        for(int item:solution(arr)){
            System.out.print(item+" ");
        }
    }

    private static int[] solution(int[] arr) {
        int ans[]=new int[arr.length];
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(arr[arr.length-1]);
        ans[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()>=arr[i])stack.pop();
            ans[i]=stack.isEmpty()?-1:stack.peek();
            stack.add(arr[i]);
        }
        return ans;
    }
}
