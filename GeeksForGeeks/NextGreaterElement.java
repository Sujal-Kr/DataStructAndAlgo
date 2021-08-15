package GeeksForGeeks;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        int x[]={112, 133, 161, 311, 122, 512, 1212, 0, 19212};
        int y[]=nextgreater(x);
        for(int item:y){
            System.out.print(item+" ");
        }
    }

    private static int[] nextgreater(int[] x) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result=new int[x.length];
        // int p=0;
        result[x.length-1]=-1;
        stack.push(x[x.length-1]);
        for(int i=x.length-2; i>=0; i--) {
            while(!stack.isEmpty()&&x[i]>=stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty())result[i]=stack.peek();
            else result[i]=-1;
            stack.push(x[i]);
        }
        return result;
    }
}
