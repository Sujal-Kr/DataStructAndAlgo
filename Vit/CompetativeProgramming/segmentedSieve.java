package Vit.CompetativeProgramming;
import java.util.*;

import javax.swing.plaf.TreeUI;
public class segmentedSieve {
    public static void main(String[] args) {
        // difference between these two must be greater than Math.pow(10,6)
        int low=110;
        int high=130;
        solution(low, high);
        // System.out.println(Math.sqrt(130));
    }

    private static void solution(int low, int high) {
         ArrayList<Integer> prime= Seive.simpleSieve((int)Math.sqrt(high));
         System.out.println(prime);
         
        //  simple seive modified version
         boolean visited[]=new boolean[high+1];
         for(int p=2;p*p<=high;p++){
            int sm=(low/p)*p; // first smallest prime no  
            
            if(sm<1){
                sm+=p;
            }
            for(int i=sm;i<=high;i+=p){
                visited[i]=true;
            }
            
         }
        for(int i=low;i<=high;i++){
            if(!visited[i])System.out.print(i+" ");
        }
        
        return ;
    }
}
