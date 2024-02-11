package GeeksForGeeks;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String x="bbabcbcab";
        int ans=solution(x);
        System.out.println(ans);
    }

    private static int solution(String x) {
        int dp[][]=new int[x.length()+1][x.length()+1];
        String y=new StringBuilder(x).reverse().toString();
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
