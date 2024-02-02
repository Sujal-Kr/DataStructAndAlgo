package GeeksForGeeks;

public class SlickerThief {
    public static void main(String[] args) {
        int arr[]={6,5,5,7,4};
        System.out.println(solution(arr));
    }

    private static int  solution(int[] arr) {
        int dp[]=new int [arr.length+1];
        dp[0]=0;
        dp[1]=arr[0];
        for(int i=1;i<arr.length;i++){
            dp[i+1]=Math.max(dp[i],dp[i-1]+arr[i]);
        }
        for(int item:dp){
            System.out.println(item);
        }
        return dp[arr.length];
    }
}
