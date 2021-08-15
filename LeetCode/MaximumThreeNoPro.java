package LeetCode;
import java.util.Arrays;
public class MaximumThreeNoPro {
    public static void main(String[] args) {
        int x[]={-1,-2,-3};
        System.out.println(maximumpro(x));
    }

    private static int maximumpro(int[] x) {
        Arrays.sort(x);
        for(int item:x){
            System.out.print(item+" ");
        }
        System.out.println();
        int n=x.length-1; 
        int max;
        max=Math.max(x[n]*x[n-1]*x[n-2],x[0]*x[1]*x[n]);
        return max;
    }
}
