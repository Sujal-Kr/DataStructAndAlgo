package GeeksForGeeks;
import java.util.*;
public class FirstNegativeIntegerInEveryWindow {
    public static void main(String[] args) {
        long arr[]={-8, 2, 3, -6, 10};
        for(long item:solution(arr,2)){
            System.out.print(item+ " ");
        }
    }
    public static long[] solution(long[] arr,int k){
        long[] res = new long[arr.length-k];
        Deque<Long> queue = new ArrayDeque<Long>();
        for(int i=0;i<k;i++){
            if(arr[i]<0)queue.add((long)i);
        }
        res[0]=queue.size()==0?0:queue.pollFirst();

        for(int i=1;i<arr.length-k;i++){
            if(arr[i]<0){
                queue.add((long)i);
            }
            if(!queue.isEmpty()&&queue.peekFirst()<i)queue.pollFirst();
            if(queue.isEmpty())res[i]=0;
            else{
                res[i]=queue.pollFirst();
            }
        }
        return null;
    }
}
