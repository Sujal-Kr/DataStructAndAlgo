package GeeksForGeeks;
import java.util.*;
public class TrippleSum {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the size of the Array: ");
        int n=in.nextInt();
        System.out.println("Enter the array elements: ");
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the value of element X");
        int x=in.nextInt();
        for(int p=1; p<n-1; p++){
            int i=0;
            int j=n-1;
        
            while(i<j&&i<p&&j>p){
                if(a[i]+a[p]+a[j]>x){
                    j--;
                }
                else if(a[i]+a[p]+a[j]<x){
                    i++;
                }
                else{
                    System.out.println(a[i]+" "+a[j]+" "+a[p]);
                    break;
                }
            }
        }
        in.close();
    }
}
