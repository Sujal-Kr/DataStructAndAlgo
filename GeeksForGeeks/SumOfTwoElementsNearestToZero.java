package GeeksForGeeks;
import java.util.*;
public class SumOfTwoElementsNearestToZero {
    public static void main(String[] args) {
        int arr[]={-43, -37, 5 ,4 ,-33, 17, -46, -27, -39, -13, -50, -45, 12, -34, -15, -12};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        Arrays.sort(arr);
        int ans=Integer.MIN_VALUE;
        int i=0;
        int j=arr.length-1;
        int diff=Integer.MAX_VALUE;
        
        while(i<j){
            int sum=arr[i]+arr[j];
            if(diff>=Math.abs(sum-0)){
                if(diff==Math.abs(sum-0))ans=Math.max(ans,sum);
                else{
                    ans=sum;
                    diff=Math.abs(sum-0);
                }
            }
            if(sum<0)i++;
            else j--;
        }
        return ans;
    }
}
