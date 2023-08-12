
import java.util.Scanner;
public class Bitonic {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Size of the array");
        int n=in.nextInt();
        int[] x=new int[n];
        System.out.println("enter the array elements in Camel case order");
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }int max=0 ;
        int p=0;
        while(p<n-1){
            if(x[p]<x[p+1]){
                max=x[p+1];
            }
            else{
                break;
            }
            p++;
        }
        System.out.println("Maximum:" + max);

        in.close();
    }
    
}
