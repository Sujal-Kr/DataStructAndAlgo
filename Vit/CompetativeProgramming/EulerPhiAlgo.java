package Vit.CompetativeProgramming;

public class EulerPhiAlgo {
    public static void main(String[] args) {
        int ans=solution(10);
        System.out.println(ans);
    }

    private static int solution(int n) {
        int res=n;
        for (int p=2; p*p<=n;++p) {
            
            if(n%p==0) {
                
                while (n%p==0)
                    n /= p;
                res *= (1.0-(1.0/p));
            }
        }
        if(n>1){
            res-=res/n;
        }
        return res;
    }
}
