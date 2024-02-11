package GeeksForGeeks;

public class CatalanNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
