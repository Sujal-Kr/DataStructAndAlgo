package GeeksForGeeks;
import java.util.*;
public class CountDistinctPairsWithDifferenceK {
    public static void main(String[] args) {
        int arr[]={1, 5, 4,1,2};
        int k=0;
        int ans=solution(arr,k);
        System.out.println(ans);
    }

    private static int solution(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        int count=0;
        for(int item:map.keySet()){
            int tmep=Math.abs(item-k);
            
        }
        return count;
    }
}
