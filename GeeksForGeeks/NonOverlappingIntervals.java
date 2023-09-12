package GeeksForGeeks;
import java.util.*;
public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int intervals [][] = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int ans=solution(intervals);
        System.out.println(ans);
    }

    private static int solution(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0]<end){
                count++;
                if(intervals[i][1]<end){
                    end=intervals[i][1];
                }
            }else{
                end=intervals[i][1];
            }
        }
        return count++;
    }
}
