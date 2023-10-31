package GeeksForGeeks;
import java.util.*;
public class FrequencyGame {
    public static void main(String[] args) {
        int arr[]={2,2,5,50,1};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    
        for(int item:arr){

            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);

            }else{
                map.put(item,1);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int item:map.keySet()){
            min=Math.min(min,map.get(item));
        }
        int max=Integer.MIN_VALUE;
        for(int item:map.keySet()){
            if(map.get(item)==min){
                max=Math.max(max,item);
            }
        }
        return max;
    }
}
