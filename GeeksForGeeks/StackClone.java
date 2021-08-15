package GeeksForGeeks;
import java.util.Stack;
public class StackClone{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> cloned=new Stack<Integer>();
        for(int i = 1; i <5;i++){
            stack.push(i);
        }
        System.out.println(stack);
        clonestack(stack,cloned);
        System.out.println(cloned);
        
    }
    private static void reverse(Stack<Integer> stack) {
        // simply take the top most element from the stack and push it back to the stack but at the bottom .
        if(stack.isEmpty()) return;
        int temp=stack.pop();
        reverse(stack);
        insertlast(stack,temp);
    }

    private static void insertlast(Stack<Integer> stack,int temp) {
        // now one by one pop the element from stack and when eventually the stack is empty then push the temp element to stack(bottom) and now push all the elements back to the stack.
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }
        int top=stack.pop();
        insertlast(stack,temp);
        stack.push(top);
        // thats how we will get an reversed stack using recursive function where time complexity is big O(N*N).(with out using extra space).
    }
    private static void clonestack(Stack<Integer> stack,Stack<Integer> cloned) {
        // reverse the original array and push it in the stack which is to be cloned
        reverse(stack);
        while(!stack.isEmpty())cloned.push(stack.pop());
        
    }
}