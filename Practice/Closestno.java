package Practice;

import java.util.Scanner;
public class Closestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array size");
        int n=in.nextInt();
        int[] x=new int[n];
        System.out.println("enter the array element:");
        for(int i=0; i<n; i++){
            x[i] = in.nextInt();
        }
        System.out.println("enter the element");
        int y=in.nextInt();
        
        int sum = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(Math.abs(y-sum)>Math.abs(y-x[i]+x[j]+x[k])){
                        sum=x[i]+x[j]+x[k];
                    }
                }
            }
        }
        System.out.println("Closest Sum="+sum);
        in.close();
    }
    
}
