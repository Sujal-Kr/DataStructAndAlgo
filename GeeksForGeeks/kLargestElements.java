package GeeksForGeeks;
import java.util.*;
public class kLargestElements {
    public static void main(String[] args) {
        int arr[]={12, 5, 787, 1000, 1123};
        for(int item:solution(arr,2)){
            System.out.print(item +" ");
        }
    }

    private static int[] solution(int[] arr,int k) {
        int ans[]=new int[k];
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.remove();
                pq.add(arr[i]);
            };
        }
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=pq.remove();
        }
        return ans;
    }
}
