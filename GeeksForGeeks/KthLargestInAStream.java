package GeeksForGeeks;
import java.util.*;
public class KthLargestInAStream {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        for(int item:solution(arr,2)){
            System.out.print(item+" ");
        }
    }

    private static int[] solution(int[] arr,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int []ans=new int[arr.length];

        k--;
        for(int i=0;i<ans.length;i++){
            if(i<k){
                ans[i]=-1;
                pq.add(arr[i]);
                continue;
            }
            if(i==k){
                pq.add(arr[i]);
                ans[i]=pq.isEmpty()?arr[i]:pq.peek();
                continue;
            }
            if(pq.peek()<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
            ans[i]=pq.peek();
        }
        return ans;
    }
}
