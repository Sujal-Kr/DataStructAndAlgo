package GeeksForGeeks;
import java.util.*;
public class LongestSubsequence {
    public static void main(String[] args) {
        int x[]={2,6,1,9,4,5,3};
        System.out.println("count: " +solution(x));
    }

    private static int solution(int[] x) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0; i<x.length; i++){
            map.put(x[i],i);
        }
        // int count=0;
        // int maxcount=0;
        for(int i=0; i<x.length; i++){
            int temp=x[i];
            if(map.containsKey(temp++)){
                
            }

        }

        return 0;
    }
}
