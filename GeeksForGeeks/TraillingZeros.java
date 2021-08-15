package GeeksForGeeks;

public class TraillingZeros {
    public static void main(String[] args) {
        System.out.println(compute(5));
    }

    private static int compute(int n) {
        int res=0;
        for(int i=5;i<=n;i*=5) {
            res+=n/i;
        }
        return res;
    }
}
