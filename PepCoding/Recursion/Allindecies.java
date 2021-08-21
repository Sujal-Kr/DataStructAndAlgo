package PepCoding.Recursion;
import java.util.*;
public class Allindecies {
    public static void main(String[] args) {
        int[] x={1,2,3,3,9,3};
        System.out.println(printAll(x,0,3));
        // for(int item:y){
        //     System.out.print(item+" ");
        // }
    }

    private static List<Integer> printAll(int[] x, int i, int k) {
       
        if(i==x.length){
           return new ArrayList<Integer>();
        }
        List<Integer> list=printAll(x,i+1,k);
        if(x[i]==k)list.add(i);
        return list;
    }
}
