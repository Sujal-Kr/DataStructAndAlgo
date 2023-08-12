

import java.util.Scanner;
public class fibonaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any no:");
        int x=in.nextInt();
        int a=0;
        int b=1;
        int s=0;
        System.out.print("Factorial : "+a+" "+b+" ");
        for(int i=1;i<=x;i++) {
            s=a+b;
            a=b;
            b=s;
            System.out.print(s+" ");
            in.close();
        }
        
    }
    
}
