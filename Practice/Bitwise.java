package Practice;

import java.util.Scanner;
public class Bitwise {
    public static void main(String[] args) {
        System.out.println("Enter the Array size:");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the array elements:");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        for(int i=0; i<n-1; i++){
            a[i]=a[i]^a[i+1];
        }
        for(int item:a){
            System.out.print(item+" ");
        }
        in.close();
    }
}
