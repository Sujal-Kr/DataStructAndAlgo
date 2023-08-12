package GeeksForGeeks;
import java.util.*;
public class LongestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int arr1[]={-1, 1, -1, 1};
        System.out.println(solution(arr1));
    }

    private static int solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int max=0;
        
        map.put(0,-1);
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                max=Math.max(max,len);
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(map);
        return max;
    }
}
