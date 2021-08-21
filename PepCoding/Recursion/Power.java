package PepCoding.Recursion;

public class Power {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(compute(a,b));
    }

    private static int compute(int a, int b) {
        // if(b==0)return 1;
        // if(b==1)return a;
        // return a*compute(a, b-1);
        
        // better  time complexity
        if(b==1)return a;
        if(b==0)return 1;
        if(b%2==0){
            return compute(a*a,b/2);
        }
        return a*compute(a,b-1);
    }
}
