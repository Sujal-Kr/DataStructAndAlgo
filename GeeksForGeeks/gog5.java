package GeeksForGeeks;
//Sorting and replacing the missing no with "-1"
import java.util.Scanner;

public class gog5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  the size of array:");
        int n=in.nextInt();
        int a[]= new int[n];
        int x[]= new int[n];
        int y[]= new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }  
        int c=0;
        for(int i=0; i<n; i++){
            a[i]=c++;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i]==x[j]){
                    y[i]=x[j];
                }
                
            }
        }
        for(int i=1; i<n; i++){
            if(y[i]==0){
                y[i]=-1;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(y[i]+" ");

        }
        in.close();
    }
}