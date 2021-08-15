package GeeksForGeeks;
import java.util.*;
public class CountOccurence {
    public static void main(String[] args) {
        int[] x={2,3,3,2};
        int k=3;
        int number=soultion(x,k);
        System.out.println("result :"+number);
    }

    private static int soultion(int[] x,int k) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int item : x){
            if(map.containsKey(item))map.put(item,map.get(item)+1);
            else map.put(item,1);
        }
        int feq=x.length/k;
        Set<Integer> a=new HashSet<Integer>();
        for(int item : x){
            if(map.get(item)>feq)a.add(item);
        }
        return a.size();
    }
}
