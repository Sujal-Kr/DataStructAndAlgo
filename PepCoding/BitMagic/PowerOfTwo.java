package PepCoding.BitMagic;

public class PowerOfTwo {
    public static void main(String[] args) {
        long x=1024;
        System.out.println(solution(x));
    }

    private static boolean solution(long x) {
        long temp=1;
        if(x==1)return true;
        while(temp<=x){
            temp=temp<<1;
            if(temp==x)return true;
        }
        return false;
    }
}
