package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        int num=1534236469;
        System.out.println(solution(num));
    }
    public static int solution(int num) {
        boolean neg=false;
        if(num==0)return 0;
        if(num*-1==Math.abs(num)){
            neg=true;
        }
        long n=(long)Math.abs(num);
        long a=0;
        while(n>0){
            long r=n%10;
            a=a*10+r;
            n/=10;
        }
        if(neg==true){
            a*=-1;
            
        }
        if(a>=-2147483648 && a<=2147483647){
            return (int)a;
        }
        return 0;
        
    }
}
