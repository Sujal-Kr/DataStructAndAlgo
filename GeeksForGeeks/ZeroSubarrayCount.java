package GeeksForGeeks;

import java.util.*;

public class ZeroSubarrayCount {
    public static void main(String[] args) {
        long arr[]={0,0,5,5,0,0};
        int ans=solution(arr);
        System.out.println(ans);
    }

    private static int solution(long[] arr) {
        Map<Long,Integer> map=new HashMap<>();
        map.put((long)0,1);
        int count=0;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum))count+=map.get(sum);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
