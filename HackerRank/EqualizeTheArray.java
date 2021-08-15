package HackerRank;
import java.util.*;
public class EqualizeTheArray {
    public static void main(String[] args) {
        int[] x={32 ,32, 35, 35, 76, 62};
        int deletion=delete_count(x);
        System.out.println("minimum no of deletions is " + deletion);
    }

    private static int delete_count(int[] x) {
        Map<Integer, Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        // int count=0;
        int sum=0;
        for(int item:x){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }
            else map.put(item,1);
            max=Math.max(max,map.get(item));
        }
        List<Integer> list=new ArrayList<Integer>(map.values());
        for(int item:list){
            sum+=item;
        }
        return sum-max;
    }
}
