package GeeksForGeeks;

public class MinimumNumberOfDeletionsAndInsertions {
    public static void main(String[] args) {
        String x="heap";
        String y="pea";
        System.out.println(solution(x, y));
    }

    private static int  solution(String x, String y) {
        int dp[][]=new int [x.length()+1][y.length()+1];
        for(int i=1;i<dp.length;i++) {
            for(int j=1;j<dp[i].length;j++) {
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int temp=dp[dp.length-1][dp[0].length-1];
        return x.length()+y.length()-2*temp;
    }
}
