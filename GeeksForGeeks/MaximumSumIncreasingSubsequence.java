package GeeksForGeeks;
public class MaximumSumIncreasingSubsequence{
    public static void main(String[] args) {
        int arr[]={9,4,8,2};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int dp[]=new int[arr.length];
        int max=arr[0];
        dp[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]);
                }
            }
            dp[i]+=arr[i];
            max=Math.max(max,dp[i]);
        }
        
        return max;
    }
}