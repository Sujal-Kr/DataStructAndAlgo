package GeeksForGeeks;
import java.util.ArrayDeque;
import java.util.Arrays;
public class ChoclateDistribution {
    public static void main(String[] args) {
        long[] x={7, 3, 2, 4, 9, 12, 56};
        int k=3;
        System.out.println("min: " +solution(x,k));
    }
 
    private static long solution(long[] x,int k) {
        ArrayDeque<Long> a=new ArrayDeque<Long>();
        Arrays.sort(x);
        Long min=Long.MAX_VALUE;
        for(int i=0; i<x.length; i++) {
            if(i<k){
                a.addLast(x[i]);
            }
            else{
                min=Math.min(min,(a.peekLast()-a.peekFirst()));
                a.removeFirst();
                a.addLast(x[i]);
            }
        }
        min=Math.min(min,(a.peekLast()-a.peekFirst()));
        return min;
    }
    
    
}
