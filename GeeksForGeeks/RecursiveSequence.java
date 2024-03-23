package GeeksForGeeks;
public class RecursiveSequence {
    public static void main(String[] args) {
        int n=9;
        System.out.println(solution(n));
    }

    private static long solution(int n) {
        long ans=0;
        int mod=1000000007;
        int p=1;
        for(int i=1; i<=n; i++){
            int j=0;
            long temp=1;
            while(j<i){
                temp=(temp*p)%mod;
                p++;
                j++;
            }
            ans=(ans+temp)%mod;
        }
        return ans;
    }
}
