package GeeksForGeeks;
import java.util.*;
public class MinimizeTheHieght{
    public static void main(String[] args) {
        int arr[] = {2 ,6, 3, 4, 7, 2, 10, 3, 2, 1};
        int ans=getMinDiff(arr,5);
        System.out.println("\n"+ans);
    }
    public static int getMinDiff(int[] arr ,int k) {
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>k)arr[i]-=k;
            else arr[i]+=k;
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }

        return arr[n-1]-arr[0];
    }
}