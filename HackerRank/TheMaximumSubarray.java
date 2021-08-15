package HackerRank;
import java.util.*;
public class TheMaximumSubarray{
    public static void main(String[] args) {
        List<Integer> z=new ArrayList<>();
        int[] x={-2 ,-3 ,-1, -4, -6};
        for(int i=0; i<x.length;i++){
            z.add(x[i]);
        }
        System.out.println(solution(z));
    }

    private static List<Integer> solution(List<Integer> x) {
        
        List<Integer> ans=new ArrayList<>();
        int curr=0;
        int sum=0;
        int farmax=Integer.MIN_VALUE;
        boolean neg=true;
        for(int item:x){
            if(item>=0)
            neg=false;
        }
        for(int i=0; i<x.size(); i++){
            curr=Math.max(curr+=x.get(i),x.get(i));
            farmax=Math.max(farmax,curr);
            if(x.get(i)>=0)sum+=x.get(i);
        }
        if(neg==true){
            int max=Integer.MIN_VALUE;
            for(int item:x){
                max=Math.max(max,item);
            }
            sum=max;
        }
        ans.add(farmax);
        ans.add(sum);
        
        return ans;
    }
    
}