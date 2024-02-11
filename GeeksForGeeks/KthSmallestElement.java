package GeeksForGeeks;
import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[]={ 7 ,10, 4, 3, 20, 15};
        int ans=solution(arr,0,4,4);
        System.out.println(ans);
    }

    private static int solution(int[] arr, int l, int r, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=l; i<=r; i++) {
            
        }
        return pq.peek();
    }
}
