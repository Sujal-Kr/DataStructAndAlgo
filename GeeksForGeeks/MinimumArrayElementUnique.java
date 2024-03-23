package GeeksForGeeks;
import java.util.*;
public class MinimumArrayElementUnique {
    public static void main(String[] args) {
        int arr[]={1, 2, 2};
        System.out.println(solution(arr));
    }

    private static long solution(int[] arr) {
        Arrays.sort(arr);
        HashSet<Long> set=new HashSet<>();
        long max=-1;    
        long ans=0;
        for(int i=0; i<arr.length; i++){
            
            max = Math.max(max,arr[i]);
            if(set.contains((long)arr[i])){
                ans+=max-arr[i]+1;
                max++;
                set.add(max);
            }else{
                set.add((long)arr[i]);
            }
        }
        return ans;
    }
}
