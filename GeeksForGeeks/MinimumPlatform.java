package GeeksForGeeks;
import java.util.*;


public class MinimumPlatform {
    public static void main(String[] args) {
        String arr[] = {"0900", "0940", "0950", "1100", "1500", "1800"};
        String dep[] = {"0910", "1200", "1120", "1130", "1900", "2000"};
        System.out.println(solution(arr, dep));
    }

    private static int solution(String[] arr, String[] dep) {
        int count=1;
        int available = 0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(Integer.parseInt(dep[0]));
        for(int i=1; i<arr.length; i++) {
            while(!pq.isEmpty()&&pq.peek()<Integer.parseInt(arr[i])) {
                pq.remove();
                available++;
                
            }
            if(available!=0){
                pq.add(Integer.parseInt(dep[i]));
                available--;
            }
            else{
                pq.add(Integer.parseInt(dep[i]));
                count++;
            }
            
        }
        return count;
    }
}
