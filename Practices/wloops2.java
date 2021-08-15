package Practices;
import java.util.Scanner;
public class wloops2 {
    public static void main (String[] args){
        System.out .println("Enter a no: ");
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int p=n;
        int x=0;
        int a=0;
        while (n>0){
            a=n%10;
            x=x*10+a;
            n=n/10;
        }
        if(p==a){
            System.out.println(p+" is a palindrome no.");
        }
        else
        {
            System.out.println(p+" is not a palindrome no.");
        }
        in.close();
    }
}
