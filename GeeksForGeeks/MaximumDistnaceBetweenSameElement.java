package GeeksForGeeks;
import java.util.*;
public class MaximumDistnaceBetweenSameElement{
    public static void main(String[] args) {
        int x[]={1, 1, 2, 2, 2, 1};
        int ans= solution(x);
        System.out.println(ans);
    }

    private static int solution(int[] x) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<x.length;i++){
            map.putIfAbsent(x[i], new ArrayList<Integer>());
            map.get(x[i]).add(i);
        }
        int max=0;
        for(int item:map.keySet()){
            if(map.get(item).size()>1){
                int curr=Math.abs(map.get(item).get(0)-map.get(item).get(map.get(item).size()-1));
                max=Math.max(max,curr);
            }
        }
        return max;
    }

}
