package GeeksForGeeks;
import java.util.*;
public class SmallestPostiveMissingInteger {
    public static void main(String[] args) {
        int arr[] = {0,-10,1,3,-20};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int item:arr){
            if(item>=1){
                map.put(item,1);
                max=Math.max(max,item);
                min=Math.min(min,item);
            }
        }
        
        while(min<max){
            min++;
            if(!map.containsKey(min))return min;
        }   
    
        return max+1;
    }
}
