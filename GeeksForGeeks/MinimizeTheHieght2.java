package GeeksForGeeks;
import java.util.*;
public class MinimizeTheHieght2 {
    public static void main(String[] args) {
        int arr[]={3, 9, 12, 16, 20};
        int k=3;
        System.out.println(solution(arr,k));
    }
    private static int solution(int arr[],int k){
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int res=max-min;
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i-1]+k,arr[arr.length-1]-k);
            min=Math.min(arr[i]-k,arr[0]+k);
            if(min<0)continue;
            res=Math.min(res,max-min);
        }
        return res;
    }
}
