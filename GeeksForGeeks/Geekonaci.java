package GeeksForGeeks;
import java.util.*;
public class Geekonaci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        while(t-- > 0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int n=in.nextInt();
            System.out.println(compute(a,b,c,n));
        }
        in.close();
    }

    private static int compute(int a,int b,int c,int n) {
        if(n==1)return a;
        if(n==2)return b;
        if(n==3)return c;
        return compute(a,b,c,n-1)+compute(a,b,c,n-2)+compute(a,b,c,n-3);
    }
}
