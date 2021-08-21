package PepCoding.Stacks;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class NextgreaterElement {
    public static void main(String[] args) {
        int x[]={112, 133, 161, 311, 122, 512, 1212, 0, 19212};
        int y[]=nextgreater(x);
        for(int item:y){
            System.out.print(item+" ");
        }
        System.out.println();
        System.out.println(nextgreaterelement(x));
    }
    // My approch ,time complexcity is O(N) without using stack. 
    private static List<Integer> nextgreaterelement(int[] x) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++) {
            int j=i+1;
            while(j<x.length&&x[i]>=x[j]) j++;
            list.add(j<x.length?x[j]:-1);
        }
        return list;
    }
    //Pepcoding's approch using stack;
    private static int[] nextgreater(int[] x) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result=new int[x.length];
        // int p=0;
        result[x.length-1]=-1;
        stack.push(x[x.length-1]);
        for(int i=x.length-2; i>=0; i--) {
            while(!stack.isEmpty()&&x[i]>=stack.peek())stack.pop();
            if(!stack.isEmpty())result[i]=stack.peek();
            else result[i]=-1;
            stack.push(x[i]);
        }
        return result;
    }
}
