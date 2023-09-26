package Practice;

import java.util.Scanner;
public class wloops {
    public static void main(String[] args) {
        System.out.print("Enter nay no: ");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int x=0;
        while(n>0){
            int a=n%10;
            x= x+a;
            n=n/10;
        }
        System.out.println("Sum of the Entered no is = "+x);
        in.close();
    }
    
}
