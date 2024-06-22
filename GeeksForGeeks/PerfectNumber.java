package GeeksForGeeks;
public class PerfectNumber {
    public static void main(String[] args) {
        long n=6;
        System.out.println(solution(n));
    }
    public static int solution(long n) {
        int sum=1;
        for(int i=2;i<=Math.ceil(Math.sqrt(n));i++){
            if(n%i==0){
                System.out.println(i);
                sum+=i;
            }
        } 
        return sum==n?1:0;
    }
}
