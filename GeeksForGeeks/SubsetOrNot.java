package GeeksForGeeks;

import java.util.*;

public class SubsetOrNot {
    public static void main(String[] args) {
        
        long a1[] = {11, 1, 13, 21, 3, 7};
        long a2[] = {11, 3, 7,0};
        String x=solution(a1, a2);
        System.out.println(x);
    }

    private static String solution(long[] a1, long[] a2) {
        Map<Long,Long> map=new HashMap<>();
        for(int i=0; i<a1.length; i++){
            if (map.containsKey(a1[i])) {
                map.put(a1[i],map.get(a1[i])+1);
            }
            else map.put(a1[i],(long)1);
        }
        for(long item:a2){
            if(map.containsKey(item)&&map.get(item)>0){
                map.put(item,map.get(item)-1);
            }
            else return "No";
        }
        return "Yes";
    }
}
