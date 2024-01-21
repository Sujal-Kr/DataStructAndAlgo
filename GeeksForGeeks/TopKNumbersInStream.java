package GeeksForGeeks;
import java.util.*;
public class TopKNumbersInStream {
    public static void main(String[] args) {
        int arr[]={9 ,1, 9, 1, 4};
        for(ArrayList<Integer> list:solution(arr,2)){
            for(int item:list){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> solution(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();   
        for(int i=0; i<arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a)==map.get(b)?a-b:map.get(b)-map.get(a));
            ArrayList<Integer> temp=new ArrayList<>();
            for(int item:map.keySet())pq.add(item);
            int p=k;
            while(!pq.isEmpty()&&p-->0){
                temp.add(pq.poll());
            }
            pq.clear();
            res.add(temp);
        }
        return res;
    }
}
