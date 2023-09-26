package Practice;
import java.util.*;
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {2,6,1 ,7,9,5,3};
        int count=solution(arr);
        System.out.println("count: " + count);
    }

    public static int solution(int[] arr) {
        int max=0;
        Map <Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],i);
        }
        for(int item:arr){
            int count=0;
            if(map.containsKey(item-1)){
                continue;
            }
            else{
                while(map.containsKey(item++)){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
