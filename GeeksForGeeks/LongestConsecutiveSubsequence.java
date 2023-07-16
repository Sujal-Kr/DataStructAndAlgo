package GeeksForGeeks;
import java.util.*;
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6,7,8,9,10,55,56,57};
        System.out.println(solution(x));
    }

    private static int  solution(int[] x) {
        Map<Integer, Boolean> map = new HashMap<>();
        // at first mark all the values og the array as true (which means element is the  begining the longest consicutive subsequence of the array)
        for(int item:x)map.put(item, true);
        for(int i=0;i<x.length;i++){
            // and then check wheater is it actually the begining of the longest subsequence by checking for its previous element
            if(map.containsKey(x[i]-1))map.put(x[i],false);
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0 ;i<x.length ;i++){
            int len=0;
            // now only for ture values count the length of the consicutive susbsequence
            if(map.get(x[i]))while(map.containsKey(x[i]++))len++;
            // store the ans in the max and  return it .
            // eazzy pizzy thats how she likes it.
            max=Math.max(max,len);
        }
        return max;
    }
}
