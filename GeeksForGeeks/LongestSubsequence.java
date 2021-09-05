package GeeksForGeeks;
import java.util.*;
public class LongestSubsequence {
    public static void main(String[] args) {
        int x[]={2,6,1,9,4,5,3};
        // 1 2 3 4 5 6 9
        System.out.println("count: " +solution(x));
    }

    private static int solution(int[] x) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int item:x)pq.add(item);
        for(int i=0;i<x.length;i++)x[i]=pq.remove();
        for(int i=0; i<x.length; i++){
            map.put(x[i],i);
        }
        // int count=0;
        // int maxcount=0;
        
        int max=Integer.MIN_VALUE;
        int p=0;
        
        for(int item:x)System.out.print(item+" ");
        while(p<x.length){
            int a=1;
            int leng=1;
            while(map.containsKey(x[p]+a)){
                leng++;
                a++;
            }
            p=map.get(x[p])+a;
            max=Math.max(max,leng);
            
        }
        return max;
    }
}
