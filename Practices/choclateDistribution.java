package Practices;
import java.util.*;
public class choclateDistribution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=in.nextInt();
        System.out.println("Enter the array elements");
        int[] x=new int[n];
        for(int i=0; i<n; i++){
            x[i]=in.nextInt();
        }
        int res[]=new int[n];
        Arrays.fill(res,1);

        //moving left to right ...
        for(int i=1;i<n;i++){
            if(x[i]>x[i-1]){
                res[i]=res[i-1]+1;
            }
        }
        System.out.println();
        //moving right to left ...
        for(int i=n-2;i>=0;i--){
            if(x[i]>x[i+1]){
                res[i]=Math.max(res[i+1]+1,res[i]);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+res[i];
        }
        System.out.println("sum:"+sum);
        in.close();
    }
    
}
