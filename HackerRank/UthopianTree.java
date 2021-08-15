package HackerRank;
import java.util.*;
public class UthopianTree {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the no of testcases");
        int t=in.nextInt();
        while(t-- > 0){
            System.out.println("Enter the no of periods");
            int periods=in.nextInt();
            int ans=calculate(periods);
            System.out.println(ans);
        }
        in.close();
    }
    static int calculate(int p){
        if(p==0)
        return 1;
        int heigth=1;
        for(int i=1;i<=p;i++){
            if(i%2!=0){
                heigth*=2;
            }
            else{
                heigth+=1;
            }
        }
        return heigth;
    }
}
