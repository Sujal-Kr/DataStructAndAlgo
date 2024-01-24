package Vit.CompetativeProgramming;
import java.util.*;
public class Seive {
    public static void main(String[] args) {
        int n=50;
        for(int item:simpleSieve(n)){
            System.out.print(item+" ");
        };
    }

    public static ArrayList<Integer> simpleSieve(int n) {
        // maximum upto 10 to power 6 - 9
        ArrayList<Integer> list = new ArrayList<>();
        boolean visited[]=new boolean[n+1];
        for(int i=2;i<=n;i++) visited[i]=true;
        for(int i=2;i<=n;i++){
            if(visited[i]){
                for(int j=i*i;j<=n;j+=i){
                    visited[j]=false;
                }
            }
        }
        for(int i=2 ;i<=n;i++){
            if(visited[i])list.add(i);
        }
        return list;
    }
}
