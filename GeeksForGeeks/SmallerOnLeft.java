package GeeksForGeeks;
import java.util.*;
public class SmallerOnLeft {
    public static void main(String[] args) {
        int arr[]={1, 5, 0, 3, 4, 5};
        System.out.println(solution(arr));
        System.out.println(usingStack(arr));
    }

    private static List<Integer> usingStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        stack.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            while(!stack.isEmpty()&&stack.peek()>=arr[i])stack.pop();
            list.add(stack.isEmpty()==true?-1:stack.peek());
            stack.add(arr[i]);
        }
        return list;
    }

    private static List<Integer> solution(int[] arr) {
        List<Integer> list=new ArrayList<>();
        list.add(-1);
        for(int i=1;i<arr.length;i++){
            boolean found=false;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    found=true;
                    list.add(arr[j]);
                    break;
                }
            }
            if(!found)list.add(-1);
        }
        return list;
    }   
}
