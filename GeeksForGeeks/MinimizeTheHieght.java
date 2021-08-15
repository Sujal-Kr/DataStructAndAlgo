package GeeksForGeeks;
import java.util.*;
public class MinimizeTheHieght{
    public static void main(String[] args) {
        int Arr[] = {3, 9, 12, 16, 20};
        int ans=getMinDiff(Arr,3);
        System.out.println(ans);
    }
    static int getMinDiff(int[] x ,int k) {
        int n=x.length;
        Arrays.sort(x);
        int i=0;
        int min=Integer.MAX_VALUE;
        while(i<n/2){
            x[i]+=k;
            min=Math.min(min,x[i]);
            i++;
        }
        int max=Integer.MIN_VALUE;
        while(i<n){
            if(x[i]>=k)x[i]-=k;
            else x[i]+=k;
            max=Math.max(max,x[i]);
            i++;
        }
        for(int item:x){
            System.out.print(item+" ");
        }
        System.out.println();
        return (max-min);
    }
}