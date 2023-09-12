package GeeksForGeeks;
import java.util.*;
public class OverlappingIntervals{
    public static void main(String[] args) {
        int intervals[][]={{1,3},{2,4},{6,8},{9,10}};
        for(int [] arr:solution(intervals)) {
            for(int item :arr){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solution(int[][] intervals) {
        List<int[]> list =new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        
        for(int[] interval:intervals){
            if(list.isEmpty())list.add(interval);
            else {
                int previous[]=list.get(list.size()-1);
                if(previous[1]>=interval[0])previous[1]=Math.max(previous[1],interval[1]);
                else list.add(interval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}