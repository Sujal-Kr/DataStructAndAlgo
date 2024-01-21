package GeeksForGeeks;
import java.util.*;
public class ZeroSumSubarray {
    public static void main(String[] args) {
        int arr[]={6,-1,-3,4,-2,2,4,6,-12,-7};
        System.out.println(solution(arr));

    }

    private static int  solution(int[] arr) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else map.put(sum,1);
        }
        return count;
        
    }
}
