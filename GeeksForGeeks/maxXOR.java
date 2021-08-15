package GeeksForGeeks;
import java.util.Scanner;
public class maxXOR {
    public static void main(String[] args){
        System.out.println("Enter the size of array:");
        Scanner in=new Scanner (System.in);
        int n =in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n-1];
        
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        for(int i=0; i<n-1; i++){
            b[i]=a[i]^a[i+1];
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n-1;i++){
            if(max<b[i]){
                max=b[i];
            }
        }

        System.out.println("Maximum:"+max);
        for(int i=0; i<n-1; i++){
            if(max==b[i]){
                System.out.println("Subarray:{"+a[i]+" "+a[i+1]+"}");
            }
        }
        in.close();
    }
}