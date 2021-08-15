package GeeksForGeeks;
//Wave sorting....
import java.util.Scanner;
public class gog6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= in.nextInt();
        int a[]= new int[n];
        System.out.println("Enter sorted array elements:");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        if(n%2!=0){
            for(int i=0; i<n-2; i+=2){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        else{ 
            for(int i=0; i<n; i+=2){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}
