package Practice;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        int arr[]={1,3,0,0,-1,-2,-2,5,5,3,5};
        int k=2;
        solution(arr,k);
    }

    private static void solution(int[] arr, int k) {
        // This code snippet is creating a HashMap called `map` with Integer keys and Integer values.
        // It is then iterating over the elements of the `arr` array. For each element, it checks if
        // the element is already present as a key in the map using the `containsKey()` method. If it
        // is present, it increments the value associated with that key by 1 using the `put()` method.
        // If it is not present, it adds the element as a new key in the map with a value of 1.
        Map<Integer,Integer> map=new HashMap<>();
        for(int item:arr){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        System.out.println(map);
        for( int item:map.keySet()){
            if(map.get(item)>=k){
                System.out.println(item);
            }
        }
        return ;
    }
}
