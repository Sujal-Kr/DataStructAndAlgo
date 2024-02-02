package GeeksForGeeks;
import java.util.*;
public class ReturnTwoPrimeNumbers {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solution(n));
    }

    private static List<Integer> solution(int n) {
        boolean [] prime=new boolean [n+1];
        ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<>();
        for(int i=2;i<prime.length;i++) prime[i]=true;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        } 
        for(int i=2;i<prime.length;i++){
            if(prime[i])list.add(i);
        }
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            int sum=list.get(i)+list.get(j);
            if(sum==n){
                ans.add(list.get(i));
                ans.add(list.get(j));
                return ans;
            }else if(sum<n)i++;
            else j--;
        }

        return ans;
    }
}
