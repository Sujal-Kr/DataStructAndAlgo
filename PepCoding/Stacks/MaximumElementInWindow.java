package PepCoding.Stacks;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class MaximumElementInWindow {
    public static void main(String[] args) {
        int x[]={1,4,2,7,3,6,12,56,8,56,22,76,3};
        int k=4;
        System.out.println(maximumelement(x,k));
    }

    private static List<Integer> maximumelement(int[] x,int k) {
        int [] a=new int[x.length];
        Stack<Integer> s=new Stack<>();
        List<Integer> list=new ArrayList<>();
        a[a.length-1]=a.length;
        s.push(x.length-1);
        for(int i=x.length-2; i>=0; i--){
            while(!s.isEmpty()&&x[i]>=x[s.peek()])s.pop();
            if(!s.isEmpty())a[i]=s.peek();
            else a[i]=a.length;
            s.push(i);
        } 
        for(int i=0;i<x.length-k;i++){
            int j=i;
            while(a[j]<i+k)j=a[j];
            list.add(x[j]);
        }
        return list;
    }    
}
