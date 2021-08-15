package GeeksForGeeks;
import java.util.Scanner;

public class gog4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[] a=new int[n];
        int[] x=new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        int odd=1;
        int even=0;
        for(int i=0; i<n; i++){
            if(a[i]>0){
                x[even]=a[i];
                even+=2;
            }
            else{
                x[odd]=a[i];
                odd+=2;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(x[i]+" ");
        }
        in.close();
    }
    
}
