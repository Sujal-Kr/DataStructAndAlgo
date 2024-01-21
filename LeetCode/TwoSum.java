package LeetCode;
import java.util.*;
public class TwoSum{
    public static void main(String[] args) {
        int arr[]={3,3,4};
        for(int item:solution(arr,6)){
            System.out.println(item);
        }
    }

    private static int[] solution(int[] arr, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        for(int i=0; i<arr.length; i++){
            int temp=k-arr[i];
            if(map.containsKey(temp)){
                ans[0]=map.get(temp);
                ans[1]=i;
                return ans;
            }else {
                map.put(arr[i],i);
            }
        }
        return ans;
    }
}