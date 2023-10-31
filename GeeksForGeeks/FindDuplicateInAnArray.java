package GeeksForGeeks;

import java.util.*;
public class FindDuplicateInAnArray{
    public static void main(String[] args) {
        int arr[]={6,3,1,6,2,1};
        System.out.println(solution(arr));
    }
    public static ArrayList<Integer> solution(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int item:arr){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }
            else{
                map.put(item,1);
            }
        }
        for(Integer item :map.keySet()){
            if(map.get(item)>1){
                pq.add(item);
            }
        }
        while(!pq.isEmpty()){
            list.add(pq.remove());
        }
        if(list.size()==0)list.add(-1);
        
        return list;
    }
}