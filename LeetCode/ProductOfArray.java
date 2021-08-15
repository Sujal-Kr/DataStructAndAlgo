package LeetCode;
// return an array contianing the product of arrays execpt itself.using O(N) time complexity.
import java.util.*;
public class ProductOfArray {
    public static void main(String[] args) {
        int[] x={0,2,0,4,5,6};
        long[] ans=product(x);
        for(long item:ans) {
            System.out.print(item+" ");
        }
        System.out.println();
    }

    private static long[] product(int[] x) {
        long ans[]=new long[x.length];
        int zero_count=0;
        long pro=1;
        for(int item:x){
            if(item==0)zero_count++;
            else pro*=item;
        }
        //if zero count is more than 1 so it means every ans array would be 0 in 
        // in every index.
        System.out.println("zero_count "+zero_count+" pro "+pro);
        if(zero_count>1){
            Arrays.fill(ans,0);
        }
        else if(zero_count==1){
            for(int i=0;i<x.length; i++){
                if(x[i]==0)ans[i]=pro;
                else ans[i]=0;
            }
        }
        else{
            for(int i=0;i<x.length;i++){
                ans[i]=pro/x[i];
            }
        }
        return ans;
    }
}
