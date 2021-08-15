package LeetCode;
import java.util.*;
public class MergeIntervals {
    public static void main(String[] args) {
        int x[][]={{1,3},{2,6},{8,10},{15,18}};
        int y[][]=merge(x);
        for(int[]arrays:y){
            for(int item:arrays){
                System.out.print(item+" ");
            } 
            System.out.println();
        }
    }
    private static int[][] merge(int[][] x) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(x,(a,b) -> Integer.compare(a[0],b[0]));
        for(int[] interval:x){
            if(list.isEmpty())list.add(interval);
            else{
                int previous[]=list.get(list.size()-1);
                if(previous[1]>=interval[0])previous[1]=Math.max(previous[1],interval[1]);
                else list.add(interval);
            }
        }
        
        return  list.toArray(new int[list.size()][]) ;
    }
}
