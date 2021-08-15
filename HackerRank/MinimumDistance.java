package HackerRank;
import java.util.*;
public class MinimumDistance {
    public static void main(String[] args) {
        int x[]={3,1,2,0,6};
        List<Integer> list = new ArrayList<>();
        for(int item:x){
            list.add(item);
        }
        System.out.println("min distance:"+distance(list));
    }

    private static int distance(List<Integer> x) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int item:x){
            if(map.containsKey(item))
            map.put(item,map.get(item)+1);
            else map.put(item,1);
        }
        int min=Integer.MAX_VALUE;
        for(int item:x){
            if(map.get(item)==2){
                int first=x.indexOf(item);
                int last=x.lastIndexOf(item);
                min=Math.min(min,last-first);
            }
        }
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}
