package GeeksForGeeks;
import java.util.Scanner;
public class gog {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");

        int sum=0;
        for (int i=0; i<n; i++){
            a[i]=in.nextInt();
            sum+=a[i];
        }
        if(sum%3==0){
            System.out.println("Possible");
        }
        else{
            System.out.println("not possible");
        }
        in.close();

    }
    
}
