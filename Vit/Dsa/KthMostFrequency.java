package Vit.Dsa;
import java.util.*;
public class KthMostFrequency {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,4};
        int k=2;
        solution(arr,k);
    }

    private static void solution(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int item:arr){
            if(!map.containsKey(item)){
                map.put(item, 1);
            }else{
                map.put(item, map.get(item)+1);
            }
        }
        for(int item:map.keySet()){
            if(map.get(item)>=k){
                System.out.println(item);
            }
        }
    }
}
