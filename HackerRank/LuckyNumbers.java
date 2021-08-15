package HackerRank;
// dynamic programming is needed else you are gonna face time complexcity....
public class LuckyNumbers {
    public static void main(String[] args) {
        long a=20;
        long b=25;
        System.out.println(solution(a,b));
    }

    public static long solution(long a, long b) {
        long count=0;
        for(long i=a;i<=b; i++){
            long x=sum(i);
            long y=sq(i);
            
            if(prime(x)==true&&prime(y)==true)count++;
        }
        return count;
    }
    public static boolean prime(long x){
        
        if(x==1)return false;
        if(x==2||x==3||x==5||x==7||x==11)return true;
        if(x%2==0 || x%3==0 || x%5==0 || x%7==0 || x%11==0)return false;
        return true;
    }
    private static long  sum(long n) {
        if(n==0)return 0;
        return n%10 +sum(n/10);
    }
    private static long sq(long n){
        if(n==0)return 0;
        return (long)(Math.pow(n%10, 2)+  sq(n/10));
    }
}
