package Practice;
//Using two pointer concept.. to find the sum...
import java.util.*;
public class Pract2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of array");
        System.out.println("Array mut be sorted");
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the value of X.");
        int x=in.nextInt();
        System.out.println(sum(a,x));
        in.close();
    }

    private static boolean sum(int[] a,int x) {
        int i=0,j=a.length-1;
        while(i<j){
            int sum=a[i]+a[j];
            if(sum==x){
                return true;
            }
            else if(sum>x){
                j--;
            }
            else{
                i++;
            }
        }

        return false;
    }
    
}
