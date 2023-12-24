package GeeksForGeeks;
import java.util.*;
public class MinimizeTheHieght{
    public static void main(String[] args) {
        int arr[] = {1,5,8,10};
        int ans=getMinDiff(arr,2);
        System.out.println("\n"+ans);
    }
    public static int getMinDiff(int[] arr ,int k) {
        
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int res=max-min;
        for(int i=1;i<arr.length;i++){
            max=Math.max(arr[i-1]+k,arr[arr.length-1]-k);
            min=Math.min(arr[i]-k,arr[0]+k);
            res=Math.min(res,max-min);
        }
        return res;
    }   
}