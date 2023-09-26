package Practice;

import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int[] x=new int[n+1];
        System.out.println("enter array elements");
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        System.out.println("enter the element and the index");
        int k=in.nextInt();
        int index=in.nextInt();
        for(int i=n-1;i>=index;i--){
            x[i+1]=x[i];
        }
        x[index]=k;
        for(int i=0; i<=n; i++){
            System.out.print(x[i]+" ");
        }
        in.close();
    }
    
}
