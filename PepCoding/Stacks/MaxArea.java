package PepCoding.Stacks;
import java.util.Stack;
public class MaxArea {
    public static void main(String[] args) {
        long hist[]={1, 2, 3, 4, 5};
        System.out.println(maxarearectangle(hist));
    }

    private static long maxarearectangle(long[] hist) {
        Stack<Integer> leftmin = new Stack<>();
        Stack<Integer> rightmin=new Stack<>();
        //  can be done with and without stack here it is solved using stack. storing the left min and right min in two diffrent arrays and calculating the area using l*b and getting the required ans using Math.max() finction
        int x[]=new int[hist.length];
        int y[]=new int[hist.length];
        Long max=Long.MIN_VALUE;
        x[0]=-1;
        leftmin.push(0);
        // storing the just smaller element to the left of the every element in a array
        // storing the just smaller element to the right of the every element in  different array and then calculate the max among all of them and then return the max
        for(int i=1; i<hist.length; i++){
            while(!leftmin.isEmpty()&&hist[i]<=hist[leftmin.peek()])leftmin.pop();
            if(!leftmin.isEmpty())x[i]=leftmin.peek();
            else x[i]=-1;
            leftmin.push(i);
        }
        y[hist.length-1]=hist.length-1;
        rightmin.push(hist.length-1);
        for(int i=hist.length-2; i>=0; i--){
            while(!rightmin.isEmpty()&&hist[i]<=hist[rightmin.peek()])rightmin.pop();
            if(!rightmin.isEmpty())y[i]=(rightmin.peek());
            else y[i]=hist.length;
            rightmin.push(i);
        }
        for(int item:x){
            System.out.print(item+" ");
        }
        System.out.println();
        for(int i:y){
            System.out.print(i+" ");
        }
        for(int i=0; i< hist.length; i++){
            max=Math.max(max,hist[i]*Math.abs((y[i]-x[i])-1));
        }
        return max;
    }
}
