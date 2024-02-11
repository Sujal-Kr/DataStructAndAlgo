package GeeksForGeeks;
public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String x="axxzxy";
        int ans=solution(x);
        System.out.println(ans);
    }
    public static int solution(String x){
        String  y=x;
        int dp[][]=new int[x.length()+1][x.length()+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(i!=j&&x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
