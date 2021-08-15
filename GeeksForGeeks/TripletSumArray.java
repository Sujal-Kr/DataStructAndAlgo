package GeeksForGeeks;
import java.util.Arrays;
public class TripletSumArray {
    public static void main(String[] args) {
        int [] x={11,4,45, 6, 10, 8};
        int k=13;
        System.out.println(ThreeSum(x,k));
    }

    private static int  ThreeSum(int[] x,int k) {
        Arrays.sort(x);
        int i=0;
        int j=x.length-1;
        for(int p=1;p<x.length-2;p++) {
            while(i<p&&p<j) {
                if(x[i]+x[j]+x[p]>k)j--;
                else if(x[i]+x[j]+x[p]<k)i++;
                else if(x[i]+x[j]+x[p]==k)return 1;
            }
        }
        
        return 0;
    }
}
