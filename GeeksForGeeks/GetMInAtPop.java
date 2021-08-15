package GeeksForGeeks;
import java.util.Stack;
public class GetMInAtPop {
    public static void main(String[] args) {
        int[] arr={1 ,34, 23, 17, 37, 42, 13, 39, 0, 53, 49, 6, 71};
        Stack<Integer> x= _push(arr);
        minpop(x);
    }

    private static void minpop(Stack<Integer> x) {
        while(!x.isEmpty())System.out.print(x.pop()+" ");
    }

    private static Stack<Integer> _push(int[] arr) {
        Stack<Integer> x=new Stack<Integer>();
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min=Math.min(min,arr[i]);
            x.push(min);
        }
        return x;
    }
}
