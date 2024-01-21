package GeeksForGeeks;
import java.util.*;
public class LongestSubarrayDivisibleByK {
    public static void main(String[] args) {
        int arr[]={2, 7, 6, 1, 4, 5};
        int k=3;
        int ans=solution(arr,k);
        System.out.println(ans);
    }

    private static int solution(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        map.put(0,-1);
        int len=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum%k;
            if(rem<0)rem+=k;
            if(map.containsKey(rem)){
                len=Math.max(len,i-map.get(rem));
            }else{
                map.put(rem,i);
            }
        }
        return len;
    }
}
