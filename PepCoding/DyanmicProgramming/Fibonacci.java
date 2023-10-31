package PepCoding.DyanmicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(10));
        System.out.println(fibMemoized(n,new int[n+1]));
    }

    private static int fibMemoized(int n,int qb[]) {
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int fib1=fibMemoized(n-1, qb);
        int fib2=fibMemoized(n-2, qb);
        int fibn=fib1+fib2;
        qb[n]=fibn;
        return fibn;

    }
    private static int fib(int n) {
        if(n==0||n==1){
            return n;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        return fib1+ fib2;

    }
}
