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
        Map<Integer, Integer> map=new HashMap<>();
        for(int item : x){
            if(map.containsKey(item))map.put(item,map.get(item)+1);
            else map.put(item,1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> item:map.entrySet()){
            if(item.getValue()>x.length/k)count++;
        }
        return count++;
    }
}
