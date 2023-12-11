package GeeksForGeeks;

public class SmithNumber {
    public static void main(String[] args) {
        int n=378;
        int ans=solution(n);
        System.out.println(ans);
    }

    private static int solution(int n) {
        if(isPrime(n))return 0;
        return factorsSum(n)==digitSum(n)?1:0;
    }
    private static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }

    private static int factorsSum(int n) {
        int sum=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                sum+=digitSum(n);
                n/=i;
            }
        }
        if(n!=1)sum+=digitSum(n);
        return sum;
    }
    
    private static int digitSum(int n) {
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}
