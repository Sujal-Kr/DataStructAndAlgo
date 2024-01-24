package GeeksForGeeks;
import java.util.*;
public class kClosestElement{
    public static class pair{
        int value;
        int diff;
        pair(int value, int diff){
            this.value = value;
            this.diff = diff;
        }
    }
    public static void main(String[] args) {
        int arr[]={12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
        for(int item:solution(arr,4,35)){
            System.out.print(item+" ");
        }
    }

    public static int[] solution(int[] arr,int k,int x) {
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->b.diff==a.diff?a.value-b.value:b.diff-a.diff);
        int ans[]=new int[k];
        for(int i=0; i<arr.length; i++){
            int diff=Math.abs(arr[i]-x);
            if(arr[i]==x)continue;
            pq.add(new pair(arr[i], diff));
            if(pq.size()>k)pq.remove();
        }
        int p=ans.length-1;
        while(!pq.isEmpty())ans[p--]=pq.remove().value;
        return ans;
    }
}