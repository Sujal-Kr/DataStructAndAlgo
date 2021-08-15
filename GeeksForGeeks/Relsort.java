package GeeksForGeeks;
import java.util.Scanner;
public class Relsort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size the arrays 1 and 2:");
        int n=in.nextInt();
        int m=in.nextInt();
        //int temp[]=new int[n];
        //boolean[] visited=new boolean[n]; 
        System.out.println("Enter the 1st array elements:");
        int x[]=new int[n];
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        int y[]=new int[m];
        System.out.println("Enter the 2nd array elements:");
        for(int i=0; i<m; i++){
            y[i]=in.nextInt();
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(y[i]==x[j]){
                    
                }
            }
        }
        in.close();
    } 
    
}
