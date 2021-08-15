package Practices;
import java.util.*;
public class Testcases {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the testcase");
        int t=in.nextInt();
        while(t-->0){
            System.out.println("Enter any no");
            int n=in.nextInt();
            System.out.println("your answer"+n);
        }
        in.close();
    }
}
