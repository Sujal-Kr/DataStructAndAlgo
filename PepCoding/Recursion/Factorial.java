package PepCoding.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=fact(6);
        System.out.println("Factorial: " + n);
    }

    private static int fact(int i) {
        if(i==0||i==1)return 1;
        return i*fact(i-1);
    }
}
