package Practice;

import java.util.Scanner;
public class TralingZero {
    static int fact(int n){
        int  f=1;
        while(n>0){
            f=f*n;
            n--;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int f=fact(n);
        int r;
        int count=0;
        while(f>0){
            r=f%10;
            if(r==0){
                count++;
            }
            else{
                break;
            }
            f=f/10;
        }
        System.out.println("no of traling Zeros:"+count);
        in.close();
    }    
}
