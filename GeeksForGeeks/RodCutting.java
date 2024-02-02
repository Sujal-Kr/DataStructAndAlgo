package GeeksForGeeks;
public class RodCutting{
    public static void main(String[] args) {

        int arr[]={1, 5, 8, 9, 10, 17, 17, 20};
        int ans=solution(arr,arr.length);
        System.out.println(ans);
    }

    private static int solution(int[] arr,int n) {
        
        int dp[]=new int[arr.length+1];
        for(int i=1; i<=n; i++){
            for(int j=0;j<i;j++){
                // compairing the all the possible ways ans storing them in dp array
                dp[i]=Math.max(dp[i],arr[j]+dp[i-j-1]);
            }
        }
        
        return dp[n];
    }
}