package PepCoding.Recursion;

public class DecInc {
    public static void main(String[] args) {
        int n=10;
        print(n);
    }

    private static void print(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}
