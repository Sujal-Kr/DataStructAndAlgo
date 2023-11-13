package GeeksForGeeks;
import java.util.*;
public class TopKFrequentElementsInArray{
    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3};
        int k=2;
        for(int item:solution(nums,k)){
            System.out.print(item+" ");
        }
    }

    private static int[] solution(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(a)==map.get(b)?b-a:map.get(b)-map.get(a));
        for(int item:map.keySet()){
            q.add(item);
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.remove();
        }
        return res;
    }
}