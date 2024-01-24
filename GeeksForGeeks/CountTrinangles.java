package GeeksForGeeks;
import java.util.*;
public class CountTrinangles {
    public static void main(String[] args) {
        int arr[]={6, 4, 9, 7, 8};
        int ans=solution(arr);
        System.out.println(ans);
    }

    private static int solution(int[] arr) {
        int count=0;
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=2; i--) {
            int left=0;
            int right=i-1;
            while(left<right) {
                if(arr[left]+arr[right]>arr[i]){
                    count+=right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
}
