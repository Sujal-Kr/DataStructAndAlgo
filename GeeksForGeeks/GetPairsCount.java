package GeeksForGeeks;
import java.util.*;
public class GetPairsCount {
    public static void main(String[] args) {
        int arr[]={1, 1,1, 1};
        int k=2;
        System.out.println(solution(arr,k));
    }

    private static int solution(int[] arr,int k) {
        Map<Integer,LinkedList<Integer>> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            map.putIfAbsent(arr[i], new LinkedList<>());
            map.get(arr[i]).add(i);
        }
        int count=0;
        for(int i=0; i<arr.length; i++) {
            int temp=k-arr[i];
            if(map.containsKey(temp)){
                for(int item:map.get(temp)){
                    if(item>i){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
