package GeeksForGeeks;

public class LargestSubarrySumOfSizeAtLeatK {
    public static void main(String[] args) {
        long arr[]={1, 1, 1, 1, 1, 1};
        long ans=solution(arr,2);
        System.out.println(ans);
    }

    private static long solution(long[] arr,long k) {
        long max_sum[]=new long[arr.length];
        long curr_sum=arr[0];
        max_sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            curr_sum=Math.max(curr_sum+arr[i],arr[i]);
            // max=Math.max(max,curr_sum);
            max_sum[i]=curr_sum;
        }
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        long ans=sum;
        for(int i=(int)k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-(int)k];
            ans=Math.max(ans,Math.max(sum,sum+max_sum[i-(int)k]));
        }
        return ans;
    }
}
