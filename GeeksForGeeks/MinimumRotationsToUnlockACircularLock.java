package GeeksForGeeks;

public class MinimumRotationsToUnlockACircularLock {
    public static void main(String[] args) {
        long r=98147;
        long d=23985;
        System.out.println(solution(r,d));
    }

    private static int solution(long r, long d) {

        int ans=0;
        while(r>0){
            int diff=(int)Math.abs(r%10-d%10);
            int rev=9-diff+1;
            ans+=Math.min(diff,rev);
            r/=10;
            d/=10;
        }
        return ans;
    }
}
