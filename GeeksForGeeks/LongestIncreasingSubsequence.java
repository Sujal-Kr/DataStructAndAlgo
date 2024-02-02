package GeeksForGeeks;
import java.util.*;
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[]={5,8,3,7,9,1};
        // int ans=solution(arr);
        int ans=usingBinarySearch(arr);
        System.out.println(ans);
    }

    public static int solution(int[] arr) {
        // throw TLE Error
        // using Dynamic Programming
        int max=-1;
        int dp[]=new int[arr.length];
        dp[0]=1;
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]);
                }
            }
            dp[i]++;
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static int usingBinarySearch(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        int len=1;
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]>list.get(list.size()-1)){
                list.add(arr[i]);
                len++;
            }else{
                int index=lowerBound(list,arr[i]);
                list.set(index,arr[i]);
            }
        }
        return len;
    }

    private static int lowerBound(ArrayList<Integer> list, int key) {
        int low=0;
        int high=list.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(list.get(mid)==key){
                return mid;
            }
            else if(list.get(mid)<=key){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return high+1;
    }
}
