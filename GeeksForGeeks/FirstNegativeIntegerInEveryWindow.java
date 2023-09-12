package GeeksForGeeks;
import java.util.*;
public class FirstNegativeIntegerInEveryWindow {
    public static void main(String[] args) {
        long arr[]={12 ,-1, -7, 8, -15 ,30, 16, 28};
        for(long item:solution(arr,3)){
            System.out.print(item+ " ");
        }
    }
    public static long[] solution(long[] arr,int k){
        long[] res = new long[arr.length-k+1];
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0)queue.add(i);
        }
        res[0]=queue.isEmpty()?0:arr[queue.pollFirst()];

        for(int i=1;i<arr.length-k+1;i++){
            if(arr[i]<0){
                queue.add(i);
            }
            while(!queue.isEmpty()&&queue.peekFirst()<i)queue.pollFirst();
            if (arr[i + k - 1] < 0) {
                queue.add(i + k - 1);
            }
    
            res[i] = queue.isEmpty() ? 0 : arr[queue.peekFirst()];
        }
       
        return res;
    }
}
