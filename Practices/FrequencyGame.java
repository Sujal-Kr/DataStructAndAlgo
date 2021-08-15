package Practices;
import java.util.Scanner;
import java.util.Arrays;
public class FrequencyGame {
    static int Frequency(int x[],int k){
        int f=0;
        for(int i=0;i<x.length;i++){
            if(k==x[i]){
                f++;
            }
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=in.nextInt();
        int[] a=new int[n]; 
        int feq[]=new int[n];
        System.out.println("enter the array Elements");
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            feq[i]=Frequency(a,a[i]);
            if(feq[i]<min){
                min=feq[i];
            }
        }
        for(int c:feq){
            System.out.print(c+" ");
        }
        System.out.println("Minimum frequency: " + min);
        int max=0;
        for(int i=n-1; i>=0;i--){
            if(feq[i]==min){
                max=a[i];
                break; 
            }
        }
        System.out.println("Greatest no with least frequency: " + max);
        in.close();

    }
}
