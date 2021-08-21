package PepCoding.Stacks;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class StockSpan {
    public static void main(String[] args) {
        int[] x={100,80, 60, 70, 60, 75, 85};
        System.out.println(leftgreater(x));
        System.out.println(solution(x));
    }
    private static List<Integer> solution(int[] x) {
        // without using stack where time complexity is O(N) instead using stack we are using a two pointer algorithm and rest of the logic is same .
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for(int i = 1; i < x.length; i++){
            int j=i-1;
            while(i>0&&x[i]>=x[j])j--;
            list.add((i>0)?i-j:i+1);
        }
        return list;
    }
    // using stack
    private static List<Integer> leftgreater(int[] x) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        list.add(1);
        stack.push(0);
        for(int i = 1; i <x.length; i++) {
            // we are poping out those elements from the stack who are less than x[i] till we find a just greater element form it(left side) then push thre current element into the stack
            while(!stack.isEmpty()&&x[i]>=x[stack.peek()])stack.pop();
            if(!stack.isEmpty())list.add(i-stack.peek());
            else list.add(i+1);
            stack.push(i);
        }
        return  list;
    }
}
